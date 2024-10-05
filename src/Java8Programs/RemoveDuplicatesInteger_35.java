package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Q35. Write a program to remove duplicates from a list of integers
    using the Java 8 Streams API.
       Sample;	Input:  [1, 2, 3, 4, 2, 5, 3, 6, 1]
	            Output: [1, 2, 3, 4, 5, 6]
*/
public class RemoveDuplicatesInteger_35 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6, 1);
        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumbers);
    }

}
