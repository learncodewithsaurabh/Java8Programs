package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Q. Write a program to remove duplicate words from a list using the Java 8 Streams API.
Q. What is the role of the distinct() method in Java Streams?
Q. How to collect the result of a stream operation into a new list in Java?
Q. How to create a list of words and remove duplicates using Java 8 Stream API?
Q. How to eliminate duplicate elements in a list using Java's Collectors.toList() method?
Q. How to use Arrays.asList() to initialize a list and remove duplicate words in Java?
Q. How can you print the unique elements from a list using Java Streams?
Q. What is the purpose of collect(Collectors.toList()) in the Java Stream API?
Sample:
Input:  "apple", "banana", "apple", "orange", "banana", "grape"
Output:  [apple, banana, orange, grape]
 */
public class RemoveDuplicateWords13 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
        List<String> uniqueWordList = words.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueWordList);
    }
}
