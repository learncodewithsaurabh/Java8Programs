package Java8Programs;

import java.util.Arrays;
import java.util.List;

/*
Q24. Write a program to find the average of a list of integers
    using the Java 8 Streams API.
    Sample;
    Input:   1, 2, 3, 4, 5, 6
    Output: Average: 3.5
*/
public class AverageOfList_24 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average: "+avg);
    }
}
