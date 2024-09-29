package Java8Programs;

import java.util.Arrays;
import java.util.List;
/*Q. Write a program to find the first element in a list using the Java 8 Streams API.
   Sample;
       Input: "apple", "banana", "orange", "grape"
	   Output:   apple
 */


public class FirstWordGet14 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","orange","grape");
        words.stream().findFirst().ifPresent(System.out::println);
    }
}
