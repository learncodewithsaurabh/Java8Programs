package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Q. Write a program to
    Calculate Factorials of a List of Numbers
    using the Java 8 Streams API.
    Sample;
    Input:  [1, 2,  3,   4,    5,   6]
    Output: [1, 2, 6, 24, 120, 720]*/
public class CalculateFactorials_58 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> factorials = numbers.stream().map(CalculateFactorials_58::fact).collect(Collectors.toList());
        System.out.println(factorials);
    }
    private static Integer fact(int n){
        return (n==0)?1:n*fact(n-1);
    }
}
