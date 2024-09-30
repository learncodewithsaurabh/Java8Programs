package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*Q19. Write a program  to collect odd numbers into a set using the Java 8 Streams API.
    Sample; 	Input:   1, 2, 3, 4, 5, 6, 7, 8, 9
     	Output: [1, 3, 5, 7, 9]
*/
public class CollectOddNumbersToSet_19 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toSet());
        System.out.println(oddNumbers);
    }
}
