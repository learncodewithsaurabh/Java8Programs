package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Q5. Write a program to check if a list contains any word starting with 'A' using the Stream API.
//Input: "Amit", "Suresh", "Animesh", "Vikram", "apple", "banana", "kiwi"
public class CheckWordStartingWithA5 {
   public static void main(String[] args) {
	List<String> words = Arrays.asList("Amit", "Suresh", "Animesh", "Vikram", "apple", "banana", "kiwi");
	List<String> wordStartingWithA = words.stream()
											.filter(s -> s.startsWith("A") || s.startsWith("a"))
											   .collect(Collectors.toList());
	if(!wordStartingWithA.isEmpty()) {
		System.out.println("Words starting with 'A' or 'a' is: "+wordStartingWithA);
	}else {
		System.out.println("No words starting with 'A' or 'a'.");
	}
	
}
}
/*output:
 Words starting with 'A' or 'a' is: [Amit, Animesh, apple]
 */

