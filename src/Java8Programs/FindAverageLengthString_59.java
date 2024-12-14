package Java8Programs;

import java.util.Arrays;
import java.util.List;

/*Q. Write a program to
    Find the Average Length of Strings in a List
    using the Java 8 Streams API.
    Sample;
    Input:  ["apple", "banana", "kiwi"]
    Output: Average length: 5.0 */
public class FindAverageLengthString_59 {
    public static void main(String[] args) {
       List<String> words = Arrays.asList("apple", "banana", "kiwi");
       double avgStringLength = words.stream().mapToInt(String::length).average().orElse(0);
        System.out.println("Average String Length: "+avgStringLength);
    }
}
