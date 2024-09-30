package Java8Programs;

import java.util.Arrays;
import java.util.List;

/*
Q. Write a program  to check if no elements in a list are negative using the Java 8 Streams API.
    Sample; 	Input:   1, 5, 10, 15
    Output: No negative numbers? true
*/
public class NoNegativeNumbers_22 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,5,10,15);
        boolean noNegativeNumbers = numbers.stream().noneMatch(n-> n<0);
        System.out.println("No negative numbers? "+noNegativeNumbers);
    }
}
