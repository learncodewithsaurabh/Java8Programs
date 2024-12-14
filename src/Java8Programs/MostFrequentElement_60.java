package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Q. Write a program to
    Find the Most Frequent Element in List
    using the Java 8 Streams API.
Test Cases:
    1. Non-empty list with a unique most frequent element:
        Input: [1, 2, 2, 3]
        Output: Most frequent element(s): [2]
    2. Empty list:
        Input: []
        Output: The list is empty. No frequent element to find.
    3. Non-empty list with multiple elements having the same maximum frequency:
        Input: [1, 2, 3, 2, 1, 3, 2]
        Output: Most frequent element(s): [2]
    4. List with one element:
        Input: [7]
        Output: Most frequent element(s): [7]
    5. Tie Case with multiple elements having the same maximum frequency:
        Input: [1, 2, 3, 2, 1, 3]
        Output: Most frequent element(s): [1, 2, 3]
 */
public class MostFrequentElement_60  {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,1,2,3,3);
        if(numbers.isEmpty()){
            System.out.println("The list is empty. No frequent element to find.");
        }else {
        Map<Integer,Long> freqElement =  numbers.stream().collect(Collectors.groupingBy(n-> n,Collectors.counting()));
        long maxFreq = freqElement.values().stream().max(Long::compare).orElse(0L);
         List<Integer> mostFreElement = freqElement
             .entrySet()
             .stream()
             .filter(e->e.getValue()==maxFreq).map(Map.Entry::getKey)
             .collect(Collectors.toList());
            System.out.println("Most frequent element(s): "+mostFreElement);
        }
    }
}
