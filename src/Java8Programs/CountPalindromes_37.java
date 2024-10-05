package Java8Programs;

import java.util.Arrays;
import java.util.List;

/*
Q37. Write a program to count palindromes in a list using the Java 8 Streams API.
   Sample;	Input:  ["madam", "apple", "racecar", "banana", "level"]
	        Output: Number of palindromes: 3
*/
public class CountPalindromes_37 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("madam", "apple", "racecar", "banana", "level");
        long count = words
                        .stream()
                            .filter(word-> new StringBuilder(word).reverse().toString().equals(word))
                                .count();
        System.out.println("Number of palindroms: "+count);
    }
}
