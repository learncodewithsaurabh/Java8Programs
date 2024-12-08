package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Q. Write a program to
    Find the Longest Palindrome in a List
    using the Java 8 Streams API.
       Sample;  Input1:    ["madam", "hello", "civic", "noon", "level", "racecar", "kayak"]
                Output1:   Longest palindrome(s): [racecar]
                Input2:    ["madam", "hello", "civic", "noon", "level", "kayak"]
                Output2:  Longest palindrome(s): [madam, civic, level, kayak] */
public class FindLongestPalindrome_56 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("madam", "hello", "civic", "noon", "level", "kayak");
        List<String> palindromes = words.stream()
                                          .filter(word->word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
                                            .collect(Collectors.toList());
        if(palindromes.isEmpty()){
            System.out.println("No Palindrome Found!");
        }else{
            int maxLength = palindromes.stream().mapToInt(String::length).max().orElse(0);

            List<String> longestPalindromes = palindromes.stream()
                                                  .filter(word->word.length()==maxLength)
                                                   .collect(Collectors.toList());
            System.out.println("Longest palindrome(s): "+longestPalindromes);
        }

    }
}
