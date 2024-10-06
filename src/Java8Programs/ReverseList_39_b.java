package Java8Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Q39. Write a program to reverse a list of strings using the Java Collections.
    Sample;	Input:   ["apple", "banana", "orange", "grape", "kiwi"]
            Output:  [ kiwi, grape, orange, banana, apple ]
*/
public class ReverseList_39_b {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        Collections.reverse(words);
        System.out.println(words);
    }
}
