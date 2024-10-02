package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Q32. Write a program to find palindromic strings in a list using the Java 8 Streams API.
    Sample; Input:   ["madam", "apple", "racecar", "banana", "level" ]
            Output:  [ madam, racecar, level]
*/
public class PalindromicStrings_32 {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("madam", "apple", "racecar", "banana", "level");
        List<String> palindromicWord = words.stream()
                                                .filter(word -> new StringBuilder(word)
                                                                            .reverse()
                                                                            .toString()
                                                                            .equals(word))
                                                    .collect(Collectors.toList());
        System.out.println(palindromicWord);
    }
}
