package Java8Programs;

import java.util.Arrays;
import java.util.List;

/*Q. Write a program to
    Find the Element Closest to a Given Value
    using the Java 8 Streams API.
    Sample; Input:  [10, 22, 35, 33]
                    targetValue: 30
            Output: Closest to 30: 35  */
public class FindClosestToValue_46 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,22,35,29);
        int targetValue = 30;
        int closedValue = numbers.stream()
                                        .min((n1,n2)-> Integer.compare(Math.abs(n1-targetValue),Math.abs(n2-targetValue)))
                                        .orElse(0);
        System.out.println("Closest value:"+closedValue);
    }
}

