package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Q25. Write a program  to filter strings containing a specific character
     using the Java 8 Streams API.
    Sample;
     	Input:    "apple", "banana", "grape", "kiwi", "orange"
        Output: [ apple, banana, grape, orange ]
*/
public class FilterStringsByCharacter_25 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "kiwi", "orange");
        List<String> filterWords = words.stream().filter(word -> word.contains("k")).collect(Collectors.toList());
        System.out.println(filterWords);
    }
}
