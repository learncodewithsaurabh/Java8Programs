package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
Q27. Write a program  to collect prime numbers from a list using the Java 8 Streams API.
    Sample;
        Input:   [ 2, 3, 4, 5, 6, 7, 8, 9, 10 ]
        Output:  [ 2, 3, 5, 7 ]
*/
public class PrimeNumbers_27 {
    public static boolean isPrimeNumber(int num) {
        if (num == 2) return true;

        if (num <= 1)
            return false;

        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> primeNumberList = numbers.stream()
                                                    .filter(PrimeNumbers_27::isPrimeNumber)
                                                    .collect(Collectors.toList());
        System.out.println(primeNumberList);
    }

}
