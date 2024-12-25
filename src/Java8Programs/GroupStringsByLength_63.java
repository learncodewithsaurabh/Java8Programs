package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Q. Write a program to
    Group strings by their length
    using the Java 8 Streams API.
  Sample;  Input: ["apple", "bat", "cat", "banana", "grape"]
    Output: 3: [bat, cat]
            5: [apple, grape]
            6: [banana] */
public class GroupStringsByLength_63 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "cat", "banana", "grape");
        Map<Integer,List<String>> groupByLengthOfString = words.stream().collect(Collectors.groupingBy(String::length));
        groupByLengthOfString.forEach((length,group)->System.out.println(length+":"+group));
    }
}
