package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/* Q43. Write a program to find the maximum product of two integers in a list using the Java 8 Streams API.
Sample Test cases:
Case 1: Input with Positive and Negative Numbers   Input: [-5, -6, 1, 2]      Output: Maximum product of two integers = 30
Case 2: Input with Mixed Positive and Negative No. Input: [3, 5, -2, 9, 1, 7] Output: Maximum product of two integers = 63
Case 3: Input with Only Two Numbers                Input: [3, 4]              Output: Maximum product of two integers = 12
Case 4: Input with Duplicate Numbers               Input: [3, 3, 5, 7]        Output: Maximum product of two integers = 35
Case 5: Input with All Negative Numbers            Input: [-3, -4, -5]        Output: Maximum product of two integers = 20
Case 6: Input with One Element (Invalid Case)      Input: [1]                 Output: List must contain at least two integers.
*/
public class GetMaxProductOfTwoIntegers_43 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 3, 3, 7);

        if(numbers == null || numbers.isEmpty()){
            System.out.println("List is empty...");
            return;
        }

        if(numbers.size()<2){
            System.out.println("List must contain at least two integers.");
            return;
        }

        Optional<Integer> maxProduct = numbers.stream()
                                               .flatMap(i -> numbers.stream().filter(j -> !i.equals(j)).map(j -> i*j))
                                                  .max(Integer::compareTo);
        if(maxProduct.isPresent()){
            System.out.println("Maximum product of two integers: "+maxProduct.get());
        }else{
            System.out.println("No product could be calculated");
        }

            }
}
