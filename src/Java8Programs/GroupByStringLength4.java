package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Q4. Write a program in java to group strings by their length using the Stream API.

//Input: "apple", "banana", "pear", "grape", "kiwi", "orange"

public class GroupByStringLength4 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "pear", "grape", "kiwi", "orange");
		Map<Integer, List<String>> groupByLength = words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(groupByLength);
	}
}
