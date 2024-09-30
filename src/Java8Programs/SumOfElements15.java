package Java8Programs;

import java.util.Arrays;
import java.util.List;

/*Q15. Write a program to calculate the sum of all elements in a list using the Java 8 Streams API.
   Sample;	Input:  2, 4, 6, 8, 10
			Output: Sum: 30
*/
public class SumOfElements15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,6,8,10);
       int  sum =  numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: "+sum);
    }
}
