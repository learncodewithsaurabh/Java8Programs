package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Q. Write a program to
    finds the longest word(s) in a given sentence
    using the Java 8 Streams API.
    Sample Input:  "My name is Saurabh, and I work at Capgemini as a Java Developer"
           Output: Longest word(s): [Capgemini, Developer]*/
public class FindLongestWordsInSentence_57 {
    public static void main(String[] args) {
        String sentence = "My name is Saurabh, and I work at Capgemini as a Java Developer";
        int maxLength = Arrays.stream(sentence.split(" ")).mapToInt(String::length).max().orElse(0);

        List<String> longestWord = Arrays.stream(sentence.split(" "))
                                                                .filter(w->w.length()==maxLength)
                                                                    .collect(Collectors.toList());
        System.out.println("Longest Word(s): "+longestWord);
    }
}
