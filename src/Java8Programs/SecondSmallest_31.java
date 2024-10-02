package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/* Q31. Write a program to find the second-smallest element in a list using the Java 8 Streams API.
    Sample; Input:   [ 3, 7, 2, 5, 9, 1, 6 ]
            Output:    2
*/
public class SecondSmallest_31 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 5, 9, 1, 6);
        Optional<Integer> secondNumber = numbers.stream().sorted().skip(1).findFirst();
        secondNumber.ifPresent(System.out::println);
    }
}
