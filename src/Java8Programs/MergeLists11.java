package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Q.	Merge Two Lists Using Streams in Java
    Q.	Concatenate Two Lists in Java Using Stream API
    Q.	How to Merge Two Lists of Strings in Java 8?
    Q.	Combining Two Lists into One Using Stream.concat()
    Q.	Java Program to Merge Two String Lists with Stream API
    Q.	Collecting Elements from Multiple Lists into a Single List
    Q.	Merging Two Lists and Collecting Results into a New List in Java
    Q.	Using Java 8 Stream to Merge and Collect Lists

       Sample;	Input:     List1:  "apple", "banana", "grape"
			               List2:  "orange", "kiwi", "pear"
            Output:        List:   [apple, banana, grape, orange, kiwi, pear]
 */
public class MergeLists11 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "grape");
        List<String> list2 = Arrays.asList("orange", "kiwi", "pear");
        List<String> list = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
        System.out.println(list);
    }
}
