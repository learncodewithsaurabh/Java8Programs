package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* Q42. Write a program to count occurrences of each element in a list using the Java 8 Streams API.
    Sample;	Input:  ["apple", "banana", "apple", "grape", "banana", "orange","banana"]
            Output: {orange=1, banana=3, apple=2, grape=1}
*/
public class CountOccurrences_42 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "grape", "banana", "orange","banana");
        Map<String,Integer> occurrence = words.stream().collect(Collectors.groupingBy(word->word,Collectors.collectingAndThen(Collectors.counting(),Long::intValue)));
        System.out.println(occurrence);
    }
}
