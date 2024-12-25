package Java8Programs;

import java.util.Arrays;
import java.util.List;

/*Q. Write a program to
    Given a list of integers, find out all the numbers starting with 1 (or specific number)
    using the Java 8 Streams API.
    Sample;
     Input: [10, 15, 8, 49, 25, 98, 32]
     Output: 10
             15
*/
public class NumberStartingWithOne_64 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32,222);
        numbers.stream().map(s-> s+"").filter(s->s.startsWith("2")).forEach(System.out::println);
    }
}
