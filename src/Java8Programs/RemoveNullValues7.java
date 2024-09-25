package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Q7. Write a program in Java to remove Null Values from a List using the Stream API.
	//Input: "apple", null, "banana", null, "grape", "kiwi, null
public class RemoveNullValues7 {
public static void main(String[] args) {
	List<String> words = Arrays.asList("apple", null, "banana", null, "grape", "kiwi", null);
	List<String> nonNullWords = words.stream().filter(word -> word != null).collect(Collectors.toList());
	System.out.println(nonNullWords);
}
}
//output: [apple, banana, grape, kiwi]