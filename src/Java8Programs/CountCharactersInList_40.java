package Java8Programs;

import java.util.Arrays;
import java.util.List;

/* Q40. Write a program to count the number of characters in a list of strings using the Java 8 Streams API.
    Sample;
        Input:   ["apple", "banana", "grape", "orange"]
        Output: Total number of characters: 22
*/
public class CountCharactersInList_40 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "orange");
        int totalCharacters = words.stream().mapToInt(String::length).sum();
        System.out.println("Total number of characters: "+totalCharacters);
    }

}
