package Java8Programs;

import java.util.Arrays;
import java.util.List;

/* Q48. Write a program to
    Count Vowels in a List of Strings
    using the Java 8 Streams API.
    Sample; Input:  "Apple", "banana", "grape", "orange"
            Output: Total vowels: 10
*/
public class CountVowels_48 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "banana", "grape", "orange");
        long countVowel = words.stream()
                                .flatMapToInt(String::chars)
                                    .filter(ch-> "AEIOUaeiou".indexOf(ch) != -1)
                                        .count();
        System.out.println("Total Vowels = "+countVowel);
    }
}
