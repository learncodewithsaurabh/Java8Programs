package Java8Programs;

import java.util.Arrays;
import java.util.List;

/*
Q. Write a program  to check if all elements in a list are positive using the Java 8 Streams API.
    Sample: 1
    Input:      5, 12, 18, 7, 21
    Output:      All positive? true

    Sample: 2
    Input:      5, 12, 18, 7, 21
    Output:     All positive? false
*/
public class AllPositiveCheck_20 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 5, -12, 18, 7, 21);
        boolean allPostive = numbers.stream().allMatch(n->n>0);
        System.out.println("All positive? "+allPostive);
    }
}
