package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Q8. Write a program in java to flatten a list of lists using the stream api.
   Sample;
		Input:     1, 2, 3
			       4, 5, 6
				   7, 8, 9

	    Output:  [ 1, 2, 3, 4, 5, 6, 7, 8, 9 ]*/
public class FlattenList8 {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
        List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1,2,3),list2, list3);
        List<Integer> flatList = listOfList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatList);

    }
}
