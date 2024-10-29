package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Q52. Write a program to
    Find the Difference Between Two Lists
    using the Java 8 Streams API.
    Sample;
            Input:     [1, 2, 3, 4, 5]
                       [3, 4, 5, 6, 7]
            Output: Difference: [1, 2]  */
public class FindListDifference_52 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> diffValue = list1.stream().filter(num-> !list2.contains(num)).collect(Collectors.toList());
        System.out.println("Difference Value = "+diffValue);
    }
}
