package Java8Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Q38. Write a program to find all subsets of a list using the Java 8 Streams API.
   Sample;	Input:  [ 1, 2, 3]
	        Output: [ [ ], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3] ]
*/
public class AllSubsets_38 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for (Integer element: list){
            List<List<Integer>> newSubsets = new ArrayList<>();

            for (List<Integer> subset : subsets){
                List<Integer> newSubset = new ArrayList<>(subset);
                newSubset.add(element);
                newSubsets.add(newSubset);
            }
            subsets.addAll(newSubsets);
        }
        System.out.println(subsets);
    }
}
