package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Q16. Write a program to find elements greater than 10 in a list using the Java 8 Streams API.
   Sample; 	Input:     5, 12, 18, 7, 21, 9, 14
		 	Output: [12, 18, 21, 14]
 */
public class FindGreaterThan10_16 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 18, 7, 21, 9, 14);
        List<Integer> numGreaterThan10List = numbers.stream().filter(n-> n>10).collect(Collectors.toList());
        System.out.println(numGreaterThan10List);
    }

}
