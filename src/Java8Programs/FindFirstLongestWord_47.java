package Java8Programs;

import java.util.Arrays;
import java.util.Comparator;

/*Q. Write a program to
    Find the First Longest Word in a Sentence
    using the Java 8 Streams API.
    Sample; Input:  My name is Saurabh Kumar, and I work at Capgemini as a Java Developer
            Output: Longest word: Capgemini
 */
public class FindFirstLongestWord_47 {
    public static void main(String[] args) {
        String sentence = "My name is Saurabh Kumar, and I work at Capgemini as a Java Developer1";
        String longestString = Arrays.stream(sentence.split(" "))
                                           .max(Comparator.comparingInt(String::length))
                                              .orElse("");
        System.out.println("Longest Word: "+longestString);
    }
}
