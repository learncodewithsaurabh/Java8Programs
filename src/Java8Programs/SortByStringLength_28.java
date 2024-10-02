package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Q28. Write a program  to sort list of strings by length
     using the Java 8 Streams API.
    Sample;
        Input:  ["apple", "banana", "kiwi", "orange", "grape"]
        Output: [ "kiwi", "apple", "grape", "orange", "banana" ]
*/
public class SortByStringLength_28 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");
        List<String> sortedWordByLength = words.stream()
                                        .sorted((s1,s2) -> Integer.compare(s1.length(),s2.length()))
                                        .collect(Collectors.toList());
        System.out.println(sortedWordByLength);
    }

}
