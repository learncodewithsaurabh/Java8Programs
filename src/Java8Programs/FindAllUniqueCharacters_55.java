package Java8Programs;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*Q. Write a program to
     Find All Unique Characters in a String
     using the Java 8 Streams API.
     Sample;  Input:  [hello world]
              Output: [h, e, l, o, w, r, d] */
public class FindAllUniqueCharacters_55 {
    public static void main(String[] args) {
        String str = "hello world";
        Set<Character> uniqueCharacters = str
                                            .chars()
                                                .mapToObj(c->(char)c)
                                                    .filter(c-> c!= ' ')
                                                    .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(uniqueCharacters);
    }

}


