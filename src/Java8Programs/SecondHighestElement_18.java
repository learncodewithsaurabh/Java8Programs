package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*Q18. Write a program  to find the second-highest element in a list using the Java 8 Streams API.
   Sample; 	Input: 3, 8, 15, 10, 12, 25, 7
		 	Output: 15
 */
public class SecondHighestElement_18 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 8, 15, 10, 12, 25, 7);
       Optional<Integer>  secondHighestNum =  numbers.stream().sorted((a, b)-> b.compareTo(a)).skip(1).findFirst();
       secondHighestNum.ifPresent(System.out::println);
    }
}
