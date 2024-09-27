package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Q10. Q. How to find the frequency of elements in a list using Java 8 Streams?
or
Q. How to group elements in a list and count their occurrences using Java 8?
or
Q. How to use Collectors.groupingBy and Collectors.counting to calculate element frequency in a list?
or
Q. How to create a frequency map from a list of strings using Java Streams?
or
Q. How to use Stream API to generate a map of element frequencies?
 Sample;
        Input:    "apple", "banana", "apple", "orange", "banana", "banana"
         Output:   {apple=2, banana=3, orange=1}
*/
public class WordFrequency10 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");
        Map<String,Long> freqMap = words.stream().collect(Collectors.groupingBy(word-> word,Collectors.counting()));
        System.out.println(freqMap);
    }

}
