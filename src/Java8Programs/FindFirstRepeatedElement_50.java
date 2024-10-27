package Java8Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Q50. Write a program to
     Find the First Repeated Element in a List
     using the Java 8 Streams API.
     Sample;  Input:     [1, 2, 3, 4, 2, 5, 3, 6]
             Output:  First repeated element: 2 */
public class FindFirstRepeatedElement_50 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);
        Set<Integer> seen = new HashSet<>();
        int firstRepeated = numbers.stream()
                                        .filter(n-> !seen.add(n))
                                            .findFirst()
                                                .orElse(-1);
        System.out.println("First repeated element: "+firstRepeated);

    }
}
