package Java8Programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Q36. Write a program to generate list of first 10 Fibonacci numbers
    using the Java 8 Streams API.
       Sample;	Input:   termNumber = 10
	            Output: [ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ]
*/
public class FibonacciNumbers_36 {
    public static void main(String[] args) {
        int termNumber = 5;
        List<Integer> fibonacciNumbers = Stream
                                            .iterate(new int[]{0, 1}, t->new int[]{t[1],t[0]+t[1]})
                                                .limit(termNumber)
                                                  .map(n->n[0])
                                                    .collect(Collectors.toList());
        System.out.println(fibonacciNumbers);
    }
}
