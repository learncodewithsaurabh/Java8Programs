package Java8Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Q6. Write a program in Java to find duplicate elements in a list using the Stream API.
//Input:    1, 2, 3, 4, 5, 6, 3, 4, 7, 8, 6
public class FindDuplicates6 {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 3, 4, 7, 8, 6);
	Set<Integer> seen = new HashSet<Integer>();
	List<Integer> duplicates = numbers.stream()
										.filter(i -> !seen.add(i))
										   .distinct()
										      .collect(Collectors.toList());
	System.out.println(duplicates);
	
}
}
/*
 output:
 [3, 4, 6]
 */

