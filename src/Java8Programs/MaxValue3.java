package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValue3 {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(10,50,30,45,88);
	Optional<Integer> maxValue = numbers.stream().max(Integer::compareTo);
	System.out.println(maxValue);
}
}
