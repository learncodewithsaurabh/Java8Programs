package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*Q45. Write a program to
    Find Common Elements Between Two Lists
    using the Java 8 Streams API.
    Sample;	Input:  List1: ["apple", "banana", "grape", "orange"]
                    List2: ["banana", "grape", "kiwi"]
            Output:  [banana, grape]
*/
public class FindCommonElements_45 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "grape", "orange");
        List<String> list2 = Arrays.asList("banana", "grape", "kiwi");
        Set<String> commonListElement = list1.stream().filter(list2::contains).collect(Collectors.toSet());
        System.out.println("Common List Elements: "+commonListElement);
    }
}

