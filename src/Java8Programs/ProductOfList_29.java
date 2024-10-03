package Java8Programs;

import java.util.Arrays;
import java.util.List;

/* Q29 Write a program to calculate the product of all elements in a list using the Java 8 Streams API.
      Sample;	Input:   [ 1, 2, 3, 4, 5 ]
                Output:   Product: 120
*/
public class ProductOfList_29 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int product = numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println("Product: "+product);
    }
}
