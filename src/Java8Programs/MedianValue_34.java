package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Q34. Write a program to find the median value in a list of integers
    using the Java 8 Streams API.
      Sample1;
              Input:  [1, 3, 5, 7, 9]
	          Output: Median: 5.0
    Sample 2;
             Input:   [1, 3, 5, 7, 9, 11]
	         Output: Median: 6.0
*/
public class MedianValue_34 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5,7, 9, 11);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        int size = numbers.size();
        double median = size % 2 == 0 ? (sortedNumbers.get(size/2-1) + sortedNumbers.get(size/2))/2.0 : sortedNumbers.get(size/2);
        System.out.println("Median: "+median);
    }
}


