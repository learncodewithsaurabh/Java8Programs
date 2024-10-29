package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Q53. Write a program to
    Reverse the Characters of Each String in a List
    using the Java 8 Streams API.
    Sample; Input:  ["apple", "banana", "cherry"]
            Output: [elppa, ananab, yrrehc]  */
public class ReverseCharactersInStrings_53 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> reverseWord = words.stream()
                                            .map(word-> new StringBuilder(word).reverse().toString())
                                                .collect(Collectors.toList());
        System.out.println("Reverse Words: "+reverseWord);
    }
}

