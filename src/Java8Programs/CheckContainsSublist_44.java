package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*Q. Write a program to Check If a List Contains a Sublist using the Java 8 Streams API.
    Sample;
        Input:
            List:     [1, 2, 3, 4, 5, 6]
            Sub-List: [3, 4, 5]
        Output: Contains sublist: true
        */
public class CheckContainsSublist_44 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> subList = Arrays.asList(3,4,5,6);
        boolean contain = IntStream.rangeClosed(0, list.size()- subList.size()).anyMatch(i-> list.subList(i,i+ subList.size()).equals(subList));
        System.out.println("Contain SubList:"+contain);
            //1, 2, 3
           // 2, 3, 4,
          //  3, 4, 5
    }

}
