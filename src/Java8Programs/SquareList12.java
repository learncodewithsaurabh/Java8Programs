package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Q12. Write a program to merge two lists into a single list using the Java 8 Streams API?
Q#.	How to square each element of a list using Java 8 Streams?
Q#.	How to apply the map() function to transform a list in Java 8?
Q#.	How to use Java Streams to generate a list of squared values from an integer list?
Q#.	What is the Java 8 stream method to calculate the square of all elements in a list?
Q#.	How to use the map() method to perform element-wise operations in a stream in Java 8?
   Sample;	Input:     List:    2, 3, 4,  5,  6
            Output:    List:  [ 4, 9, 16, 25, 36 ]
*/
public class SquareList12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4,  5,  6);
        List<Integer> squares = list.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(squares);
    }
}
