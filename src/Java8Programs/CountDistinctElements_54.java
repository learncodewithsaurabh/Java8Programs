package Java8Programs;

import java.util.Arrays;
import java.util.List;

/*Q54. Write a program to
       Count Distinct Elements in a List
       using the Java 8 Streams API, without using a Set.
       Sample;  Input:    [1, 2, 2, 3, 4, 4, 5, 6]
               Output: Number of distinct elements: 6
    */
public class CountDistinctElements_54 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6);
        long countDistinctNumber =  numbers.stream().distinct().count();
        System.out.println("Number of distinct element: "+countDistinctNumber);
    }
}
