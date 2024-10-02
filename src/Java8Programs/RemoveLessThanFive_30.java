package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Q30. Write a program to remove elements less than 5 from a list using the Java 8 Streams API.
    Sample; Input:   [ 3, 7, 2, 5, 9, 1, 6 ]
            Output:  [7, 5, 9, 6] */
public class RemoveLessThanFive_30 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 5, 9, 1, 6);
        List<Integer> filtered = numbers.stream().filter(n->n<5).collect(Collectors.toList());
        System.out.println(filtered);
    }
}
