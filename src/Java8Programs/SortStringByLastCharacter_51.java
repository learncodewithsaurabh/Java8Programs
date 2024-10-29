package Java8Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Q51. Write a program to
    Sort Strings by Their Last Character
    using the Java 8 Streams API.
   Sample; Input:     ["apple", "banana", "grape", "orange", "kiwi"]
		   Output:   Sorted by last character:[banana, apple, grape, orange, kiwi]
 */
public class SortStringByLastCharacter_51 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "kiwi");
        List<String> sortStringByLastCharacter = words.stream()
                                                    .sorted(Comparator.comparingInt(word-> word.charAt(word.length()-1)))
                                                        .collect(Collectors.toList());
        System.out.println("Sorted by last character: "+sortStringByLastCharacter);
    }
}
