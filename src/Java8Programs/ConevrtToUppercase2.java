package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConevrtToUppercase2 {
public static void main(String[] args) {
	List<String> words = Arrays.asList("java","Spring","Saurabh", "Oracle");
	List<String> upperWords = words.stream()
									.map(String::toUpperCase)
									.collect(Collectors.toList());
	System.out.println(upperWords);
		
}
}
/*
 output: 
 [JAVA, SPRING, SAURABH, ORACLE]
 */
