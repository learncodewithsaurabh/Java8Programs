package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*Q43. Write a program to find the maximum product of two integers in a list using the Java 8 Streams API.
    Sample;	Input:    [3, 5, -2, 9, 1, 7]
            Output:   Maximum product of two integers = 81*/
public class MaxProductOfTwo_43 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, -2, 9, 1, 7);
       Optional<Integer> maxProduct =  numbers.stream().flatMap(i-> numbers.stream().map(j->i*j)).max(Integer::compareTo);
       maxProduct.ifPresent(n-> System.out.println("Maximum product of two integers are: "+n));
    }

}
