package Java8Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Q33. Write a program to convert a list of strings to a set using the Java 8 Streams API.
       Sample;
            Input:  [ "apple", "banana", "grape", "orange", "banana" ]
	        Output: [ banana, orange, apple, grape ]
*/
public class ConvertListToSet_33 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "banana");
        Set<String> wordSet = new HashSet<>(words);
        System.out.println(wordSet);
    }
}
