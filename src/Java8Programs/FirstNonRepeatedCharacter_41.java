package Java8Programs;

import java.util.LinkedHashMap;
import java.util.Map;

/*Q41. Write a program to find first non-repeated character in a string using the Java 8 Streams API.
    Sample;	Input:  input = "launcher";
            Output: l
*/
public class FirstNonRepeatedCharacter_41 {
    public static void main(String[] args) {
        String input = "launcher";
        Map<Character,Integer> characterCount = new LinkedHashMap<>();
        for(char c : input.toCharArray()){
            characterCount.put(c,characterCount.getOrDefault(c,0)+1);
        }
        characterCount.entrySet().stream()
                                  .filter(entry->entry.getValue() == 1)
                                    .map(Map.Entry::getKey)
                                      .findFirst()
                                            .ifPresent(System.out::println);
    }
}
