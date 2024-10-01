package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Q26. Write a program to convert list of strings to a single concatenated string
    using the Java 8 Streams API.
    Sample;
            Input:  [ "apple", "banana", "orange" ]
            Output: apple, banana, orange
*/
public class ConcatenateStrings_26 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange");
        String concateString = words.stream().collect(Collectors.joining(","));
        System.out.println(concateString);
    }
}
