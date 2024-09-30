package Java8Programs;
/*Q. Write a program  to skip the first 3 elements in a list using the Java 8 Streams API.
    Sample; 	Input:   "apple", "banana", "orange", "grape", "kiwi"
    Output: [grape, kiwi]
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFirstThreeElements_21 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        List<String> new_list = words.stream().skip(3).collect(Collectors.toList());
        System.out.println(new_list);
    }
}
