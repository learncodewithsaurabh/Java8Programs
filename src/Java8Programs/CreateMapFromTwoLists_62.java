package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Q. Write a program to
    Create a Map from Lists
    using the Java 8 Streams API.
 Sample;
    Input List1: ["a", "b", "c"]
    Input List2: [ 1, 2, 3 ]
    Output: Created map: {a=1, b=2, c=3}*/
public class CreateMapFromTwoLists_62 {
    public static void main(String[] args) {
        List<String> keys = Arrays.asList("a","b","c");
        List<Integer> values = Arrays.asList(1,2,3);
        Map<String, Integer> mapFromTwoList = keys.stream().collect(Collectors.toMap(k->k,v->values.get(keys.indexOf(v))));
        System.out.println("Created map from two list: "+mapFromTwoList);
    }
}
