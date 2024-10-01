package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*Q23. Write a program to find the minimum value in a list using the Java 8 Streams API.
    Sample;
           Input:    12, 45, 23, 5, 87, 19
           Output: 5
*/
public class FindMinimum_23 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45,23,5, 87,19);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        min.ifPresent(value -> System.out.println("Minimum number are: "+value));
    }
}
