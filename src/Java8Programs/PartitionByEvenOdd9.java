package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Q9. Write a program in java to partition numbers into even and odd  using the stream api.
      Sample;	Input:     List        1, 2, 3, 4, 5, 6, 7, 8, 9, 10
            Output:    Even List: [ 2, 4, 6, 8, 10 ]
       			       Odd List:  [ 1, 3, 5,  7, 9 ]*/
public class PartitionByEvenOdd9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean,List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(n-> n % 2 == 0));
        System.out.println("Even List: "+partitioned.get(true));
        System.out.println("Odd List: "+partitioned.get(false));

    }
}
