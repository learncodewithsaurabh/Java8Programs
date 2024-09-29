package Java8Programs;

import java.util.Arrays;
import java.util.List;

/*Q17. Write a program  to find the length of the longest string in a list using the Java 8 Streams API.
   Sample; 	Input:  "apple", "banana", "grapefruit", "kiwi"
		 	Output: Longest string length: 10
 */
public class LongestStringLength_17 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grapefruit", "kiwi");
        int longStrLength = words.stream().mapToInt(String::length).max().orElse(0);
        System.out.println("Longest string length: "+longStrLength);
    }
}
