package Java8Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*Q39. Write a program to reverse a list of strings using the Java 8 Streams API.
    Sample;	Input:   ["apple", "banana", "orange", "grape", "kiwi"]
            Output:  [ kiwi, grape, orange, banana, apple ]
*/
public class ReverseList_39_a {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        List<String> reverseWords = words.stream().collect(Collectors.collectingAndThen(Collectors.toList(),list->{
            Collections.reverse(list);
            return list;
        }));
        System.out.println(reverseWords);
    }
}
