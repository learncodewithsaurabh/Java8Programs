package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/* Q49. Write a program to
Find the Shortest String in a List
using the Java 8 Streams API.
   Sample; Input:   ["apple", "banana", "kiwi", "orange", "grape"]
		   Output:  Shortest String in a List = kiwi
*/
public class FindShortestString_49 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");
        Optional<String> shortestString = words.stream().min((s1, s2)-> Integer.compare(s1.length(),s2.length()));
        shortestString.ifPresent(w->System.out.println("Shortest String in a List = "+w));
    }
}

