package Java8Programs;

public class AaLogic {
   class Employee {
        private String name;
        private String department;
        //getter, setter and toString
    }

    public class FindEmployeeByDepartment_66 {
        List<Employee> employeeList = Arrays.asList(
            new Employee("Saurabh", "IT"),
            );
        List<Employee> itEmployee = employeeList.stream()
            .filter(e -> "HR".equals(e.getDepartment()))
            .collect(Collectors.toList());
            itEmployee.forEach(System.out::println);
    }
}

 import java.util.Comparator;
class Employee {
    private String name;
    private double salary;
    // Constructor, Getters & toString()
}

public class FindHighestPaidEmployee_67 {
    List<Employee> employees = Arrays.asList(
        new Employee("Rahul Sharma", 175000),
        );
    // Find the highest-paid employee
    Employee highestPaidEmp = employees.stream()
        .max(Comparator.comparingDouble(Employee::getSalary))
        .orElseThrow(() -> new RuntimeException("No employee found"));
            System.out.println("Highest Paid Employee = "+highestPaidEmp);
}
    }

//----------
class Employee {
    private String empName;
    private String departmentName;
    private double salary;
    // Constructor & Getters
}

public class FindTotalSalaryByDepartment_68 {
    List<Employee> employees = Arrays.asList(
        new Employee("Rajesh Kumar", "IT", 60000),
        );

    Map<String, Double> totalSalaryByDepartment = employees.stream()
        .collect(
            Collectors.groupingBy(Employee::getDepartmentName,
                Collectors.summingDouble(Employee::getSalary)
            )
        );
            totalSalaryByDepartment.forEach((dept,salary)->System.out.println(dept +" : "+salary));
}

        import java.util.Comparator;
class Employee {
    private String empName;
    private String departmentName;
    private double salary;
    // Constructor & Getters & toString()
}

public class Top3HighestPaidEmployeesByDept_69 {
    List<Employee> employees = Arrays.asList(
        new Employee("Saurabh", "IT", 120000),
        );

    List<Employee> top3HighestPaidEmployees = employees.stream()
        .filter(e -> "IT".equals(e.getDepartmentName()))
        .sorted(
            Comparator.comparingDouble(Employee::getSalary).reversed()
        )
        .limit(3)
        .collect(Collectors.toList());
            top3HighestPaidEmployees.forEach(System.out::println);
}

public class AllPositiveCheck_20 {
    List<Integer> numbers = Arrays.asList(5, -12, 18, 7, 21);
    boolean allPostive = numbers.stream().allMatch(n -> n > 0);
            System.out.println("All positive? "+allPostive);
}

public class AllSubsets_38 {
    List<Integer> list = Arrays.asList(1, 2, 3);
    List<List<Integer>> outerSubSets = new ArrayList<>();
            outerSubSets.add(new ArrayList<>());

            for(Integer element :list) {
                List<List<Integer>> innerSubSets = new ArrayList<>();

                for (List<Integer> subset : outerSubSets) {
                    List<Integer> newSubSet = new ArrayList<>(subset);
                    newSubSet.add(element);
                    innerSubSets.add(newSubSet);
                }
            outerSubSets.addAll(innerSubSets);
            }
            System.out.println(outerSubSets);
}

public class AverageOfList_24 {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    double avg = numbers.stream()
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);
            System.out.println("Average: "+avg);
}

public class CalculateFactorials_58 {
    private static Integer fact(int n) {
        return (n == 0) ? 1 : n * fact(n - 1);
    }
//main
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> factorials = numbers.stream()
        .map(CalculateFactorials_58::fact)
        .collect(Collectors.toList());
            System.out.println(factorials);
}

    import java.util.stream.IntStream;
public class CheckContainsSublist_44 {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> subList = Arrays.asList(3, 4, 5, 6);
    boolean contain = IntStream.rangeClosed(0, list.size() - subList.size())
        .anyMatch(i -> list.subList(i, i + subList.size()).equals(subList));
            System.out.println("Contain SubList:"+contain);
 }

public class CheckWordStartingWithA_5 {
    List<String> words = Arrays.asList("Amit", "Suresh", "Animesh", "Vikram", "apple", "banana", "kiwi");
    List<String> wordStartingWithA = words.stream()
        .filter(s -> s.startsWith("A") || s.startsWith("a"))
        .collect(Collectors.toList());
            if(!wordStartingWithA.isEmpty()) {
                System.out.println("Words starting with 'A' or 'a' is: " + wordStartingWithA);
             } else {
                System.out.println("No words starting with 'A' or 'a'.");
            }
}

    import java.util.Set;
public class CollectOddNumbersToSet_19 {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Set<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toSet());
            System.out.println(oddNumbers);
}

public class ConcatenateStrings_26 {
    List<String> words = Arrays.asList("apple", "banana", "orange");
    String concateString = words.stream().collect(Collectors.joining(","));
            System.out.println(concateString);
}

public class ConevrtToUppercase2 {
    List<String> words = Arrays.asList("java", "Spring", "Saurabh", "Oracle");
    List<String> upperWords = words.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
            System.out.println(upperWords);
}

        import java.util.HashSet;
        import java.util.Set;
public class ConvertListToSet_33 {
    List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "banana");
    Set<String> wordSet = new HashSet<>(words);
            System.out.println(wordSet);
}

public class CountCharactersInList_40 {
    List<String> words = Arrays.asList("apple", "banana", "grape", "orange");
    int totalCharacters = words.stream().mapToInt(String::length).sum();
            System.out.println("Total number of characters: "+totalCharacters);
}

public class CountDistinctElements_54 {
    List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6);
    long countDistinctNumber = numbers.stream().distinct().count();
            System.out.println("Number of distinct element: "+countDistinctNumber);
}

public class CountOccurrences_42 {
    List<String> words = Arrays.asList("apple", "banana", "apple", "grape", "banana", "orange", "banana");
    Map<String, Integer> occurrence = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
            System.out.println(occurrence);
}

public class CountPalindromes_37 {
    List<String> words = Arrays.asList("madam", "apple", "racecar", "banana", "level");
    long count = words
        .stream()
        .filter(word -> new StringBuilder(word).reverse().toString().equals(word))
        .count();
            System.out.println("Number of palindroms: "+count);
}

public class CountStringDigits_61 {
    String str = "Hello12345";
    long digitCount = str.chars().filter(Character::isDigit).count();
            System.out.println("Digit Count: "+digitCount);
}

public class CountVowels_48 {
    List<String> words = Arrays.asList("Apple", "banana", "grape", "orange");
    long countVowel = words.stream()
        .flatMapToInt(String::chars)
        .filter(ch -> "AEIOUaeiou".indexOf(ch) != -1)
        .count();
            System.out.println("Total Vowels = "+countVowel);
}

public class CreateMapFromTwoLists_62 {
    List<String> keys = Arrays.asList("a", "b", "c");
    List<Integer> values = Arrays.asList(1, 2, 3);
    Map<String, Integer> mapFromTwoList = keys.stream().collect(Collectors.toMap(k -> k, v -> values.get(keys.indexOf(v))));
            System.out.println("Created map from two list: "+mapFromTwoList);
}

        import java.util.stream.Stream;
public class FibonacciNumbers_36 {
    int termNumber = 10;
    List<Integer> fibonacciNumbers = Stream
        .iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
        .limit(termNumber)
        .map(n -> n[0])
        .collect(Collectors.toList());
            System.out.println(fibonacciNumbers);
}

public class FilterEvenNumbers1 {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 24);
    List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
            System.out.println(evenNumbers);
}

public class FilterStringsByCharacter_25 {
    List<String> words = Arrays.asList("apple", "banana", "grape", "kiwi", "orange");
    List<String> filterWords = words.stream().filter(word -> word.contains("k")).collect(Collectors.toList());
            System.out.println(filterWords);
}

        import java.util.LinkedHashSet;
        import java.util.Set;
public class FindAllUniqueCharacters_55 {
    String str = "hello world";
    Set<Character> uniqueCharacters = str
        .chars()
        .mapToObj(c -> (char) c)
        .filter(c -> c != ' ')
        .collect(Collectors.toCollection(LinkedHashSet::new));
            System.out.println(uniqueCharacters);
}

public class FindAverageLengthString_59 {
    List<String> words = Arrays.asList("apple", "banana", "kiwi");
    double avgStringLength = words.stream().mapToInt(String::length).average().orElse(0);
            System.out.println("Average String Length: "+avgStringLength);
}

public class FindClosestToValue_46 {
    List<Integer> numbers = Arrays.asList(10, 22, 35, 29);
    int targetValue = 30;
    int closedValue = numbers.stream()
        .min((n1, n2) -> Integer.compare(Math.abs(n1 - targetValue), Math.abs(n2 - targetValue)))
        .orElse(0);
            System.out.println("Closest value:"+closedValue);
}

        import java.util.Set;
public class FindCommonElements_45 {
    List<String> list1 = Arrays.asList("apple", "banana", "grape", "orange");
    List<String> list2 = Arrays.asList("banana", "grape", "kiwi");
    Set<String> commonListElement = list1.stream().filter(list2::contains).collect(Collectors.toSet());
            System.out.println("Common List Elements: "+commonListElement);
}

        import java.util.HashSet;
        import java.util.Set;
public class FindDuplicates6 {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 3, 4, 7, 8, 6);
    Set<Integer> seen = new HashSet<Integer>();
    List<Integer> duplicates = numbers.stream()
        .filter(i -> !seen.add(i))
        .distinct()
        .collect(Collectors.toList());
            System.out.println(duplicates);

}

        import java.util.Comparator;
public class FindFirstLongestWord_47 {
    String sentence = "My name is Saurabh Kumar, and I work at Capgemini as a Java Developer1";
    String longestString = Arrays.stream(sentence.split(" "))
        .max(Comparator.comparingInt(String::length))
        .orElse("");
            System.out.println("Longest Word: "+longestString);
}

        import java.util.HashSet;
        import java.util.Set;
public class FindFirstRepeatedElement_50 {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);
    Set<Integer> seen = new HashSet<>();
    int firstRepeated = numbers.stream()
        .filter(n -> !seen.add(n))
        .findFirst()
        .orElse(-1);
            System.out.println("First repeated element: "+firstRepeated);
}

public class FindGreaterThan10_16 {
    List<Integer> numbers = Arrays.asList(5, 12, 18, 7, 21, 9, 14);
    List<Integer> numGreaterThan10List = numbers.stream().filter(n -> n > 10).collect(Collectors.toList());
            System.out.println(numGreaterThan10List);
}

public class FindListDifference_52 {
    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
    List<Integer> diffValue = list1.stream().filter(num -> !list2.contains(num)).collect(Collectors.toList());
            System.out.println("Difference Value = "+diffValue);
}

public class FindLongestPalindrome_56 {
    List<String> words = Arrays.asList("madam", "hello", "civic", "noon", "level", "kayak");
    List<String> palindromes = words.stream()
        .filter(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
        .collect(Collectors.toList());
            if(palindromes.isEmpty())

    {
        System.out.println("No Palindrome Found!");
    } else

    {
        int maxLength = palindromes.stream().mapToInt(String::length).max().orElse(0);

        List<String> longestPalindromes = palindromes.stream()
            .filter(word -> word.length() == maxLength)
            .collect(Collectors.toList());
        System.out.println("Longest palindrome(s): " + longestPalindromes);
    }

}

public class FindLongestWordsInSentence_57 {
    String sentence = "My name is Saurabh, and I work at Capgemini as a Java Developer";
    int maxLength = Arrays.stream(sentence.split(" ")).mapToInt(String::length).max().orElse(0);

    List<String> longestWord = Arrays.stream(sentence.split(" "))
        .filter(w -> w.length() == maxLength)
        .collect(Collectors.toList());
            System.out.println("Longest Word(s): "+longestWord);
}

    import java.util.Optional;

public class FindMinimum_23 {
    List<Integer> numbers = Arrays.asList(12, 45, 23, 5, 87, 19);
    Optional<Integer> min = numbers.stream().min(Integer::compareTo);
            min.ifPresent(value ->System.out.println("Minimum number are: "+value));
}

    import java.util.Optional;

public class FindShortestString_49 {
    List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");
    Optional<String> shortestString = words.stream().min((s1, s2) -> Integer.compare(s1.length(), s2.length()));
            shortestString.ifPresent(w ->System.out.println("Shortest String in a List = "+w));
}

    import java.util.LinkedHashMap;

public class FirstNonRepeatedCharacter_41 {
    String input = "Saurabh";
    Map<Character, Integer> characterCount = new LinkedHashMap<>();
            for(
    char c :input.toCharArray())

    {
        characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
    }
            characterCount.entrySet().

    stream()
                .

    filter(entry ->entry.getValue()==1)
        .

    map(Map.Entry::getKey)
                .

    findFirst()
                .

    ifPresent(System.out::println);
}

public class FirstWordGet14 {
    List<String> words = Arrays.asList("apple", "banana", "orange", "grape");
            words.stream().

    findFirst().

    ifPresent(System.out::println);
}

public class FlattenList8 {
    List<Integer> list2 = Arrays.asList(4, 5, 6);
    List<Integer> list3 = Arrays.asList(7, 8, 9);
    List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1, 2, 3), list2, list3);
    List<Integer> flatList = listOfList.stream().flatMap(List::stream).collect(Collectors.toList());
            System.out.println(flatList);

}

    import java.util.Optional;

public class GetMaxProductOfTwoIntegers_43 {
    List<Integer> numbers = Arrays.asList(3, 3, 3, 7);

            if(numbers ==null||numbers.isEmpty())

    {
        System.out.println("List is empty...");
        return;
    }

            if(numbers.size() < 2)

    {
        System.out.println("List must contain at least two integers.");
        return;
    }

    Optional<Integer> maxProduct = numbers.stream()
        .flatMap(i -> numbers.stream().filter(j -> !i.equals(j)).map(j -> i * j))
        .max(Integer::compareTo);
            if(maxProduct.isPresent())

    {
        System.out.println("Maximum product of two integers: " + maxProduct.get());
    } else

    {
        System.out.println("No product could be calculated");
    }
}

public class GroupByStringLength4 {
    List<String> words = Arrays.asList("apple", "banana", "pear", "grape", "kiwi", "orange");
    Map<Integer, List<String>> groupByLength = words.stream().collect(Collectors.groupingBy(String::length));
            System.out.println(groupByLength);
}

public class GroupStringsByLength_63 {
    List<String> words = Arrays.asList("apple", "bat", "cat", "banana", "grape");
    Map<Integer, List<String>> groupByLengthOfString = words.stream().collect(Collectors.groupingBy(String::length));
            groupByLengthOfString.forEach((length,group)->System.out.println(length +":"+group));
}

public class LongestStringLength_17 {
    List<String> words = Arrays.asList("apple", "banana", "grapefruit", "kiwi");
    int longStrLength = words.stream().mapToInt(String::length).max().orElse(0);
            System.out.println("Longest string length: "+longStrLength);
}

    import java.util.Optional;

public class MaxValue3 {
    List<Integer> numbers = Arrays.asList(10, 50, 30, 45, 88);
    Optional<Integer> maxValue = numbers.stream().max(Integer::compareTo);
            System.out.println(maxValue);
}

public class MedianValue_34 {
    List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 11);
    List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
    int size = numbers.size();
    double median = size % 2 == 0 ? (sortedNumbers.get(size / 2 - 1) + sortedNumbers.get(size / 2)) / 2.0 : sortedNumbers.get(size / 2);
            System.out.println("Median: "+median);
}

    import java.util.stream.Stream;

public class MergeLists11 {
    List<String> list1 = Arrays.asList("apple", "banana", "grape");
    List<String> list2 = Arrays.asList("orange", "kiwi", "pear");
    List<String> list = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
            System.out.println(list);
}

public class MostFrequentElement_60 {
    List<Integer> numbers = Arrays.asList(1, 2, 1, 2, 3, 3);
            if(numbers.isEmpty())

    {
        System.out.println("The list is empty. No frequent element to find.");
    } else

    {
        Map<Integer, Long> freqElement = numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        long maxFreq = freqElement.values().stream().max(Long::compare).orElse(0L);
        List<Integer> mostFreElement = freqElement
            .entrySet()
            .stream()
            .filter(e -> e.getValue() == maxFreq).map(Map.Entry::getKey)
            .collect(Collectors.toList());
        System.out.println("Most frequent element(s): " + mostFreElement);
    }
}

public class NoNegativeNumbers_22 {
    List<Integer> numbers = Arrays.asList(1, 5, 10, 15);
    boolean noNegativeNumbers = numbers.stream().noneMatch(n -> n < 0);
            System.out.println("No negative numbers? "+noNegativeNumbers);
}

public class NumberStartingWithOne_64 {
    List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 222);
            numbers.stream().

    map(s ->s +"").

    filter(s ->s.startsWith("2")).

    forEach(System.out::println);
}

public class PalindromicStrings_32 {
    List<String> words = Arrays.asList("madam", "apple", "racecar", "banana", "level");
    List<String> palindromicWord = words.stream()
        .filter(word -> new StringBuilder(word)
            .reverse()
            .toString()
            .equals(word))
        .collect(Collectors.toList());
            System.out.println(palindromicWord);
}

public class PartitionByEvenOdd9 {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
            System.out.println("Even List: "+partitioned.get(true));
            System.out.println("Odd List: "+partitioned.get(false));
}

public class PrimeNumbers_27 {
    public static boolean isPrimeNumber(int num) {
        if (num == 2) return true;

        if (num <= 1)
            return false;

        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    //main
    List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> primeNumberList = numbers.stream()
        .filter(PrimeNumbers_27::isPrimeNumber)
        .collect(Collectors.toList());
            System.out.println(primeNumberList);
}

public class ProductOfList_29 {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    int product = numbers.stream().reduce(1, (a, b) -> a * b);
            System.out.println("Product: "+product);
}

public class RemoveDuplicateWords13 {
    List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
    List<String> uniqueWordList = words.stream().distinct().collect(Collectors.toList());
            System.out.println(uniqueWordList);
}

public class RemoveDuplicatesInteger_35 {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6, 1);
    List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
            System.out.println(uniqueNumbers);
}

public class RemoveLessThanFive_30 {
    List<Integer> numbers = Arrays.asList(3, 7, 2, 5, 9, 1, 6);
    List<Integer> filteredNumbers = numbers.stream().filter(n -> n >= 5).collect(Collectors.toList());
            System.out.println(filteredNumbers);
}

public class RemoveNullValues7 {
    List<String> words = Arrays.asList("apple", null, "banana", null, "grape", "kiwi", null);
    List<String> nonNullWords = words.stream().filter(word -> word != null).collect(Collectors.toList());
            System.out.println(nonNullWords);
}
//output: [apple, banana, grape, kiwi]

public class ReverseCharactersInStrings_53 {
    List<String> words = Arrays.asList("apple", "banana", "cherry");
    List<String> reverseWord = words.stream()
        .map(word -> new StringBuilder(word).reverse().toString())
        .collect(Collectors.toList());
            System.out.println("Reverse Words: "+reverseWord);
}
    }

        import java.util.Collections;

public class ReverseList_39_a {
    List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
    List<String> reverseWords = words.stream().collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
        Collections.reverse(list);
        return list;
    }));
            System.out.println(reverseWords);
}

    import java.util.Collections;

public class ReverseList_39_b {
    List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
            Collections.reverse(words);
            System.out.println(words);
}

    import java.util.Optional;

public class SecondHighestElement_18 {
    List<Integer> numbers = Arrays.asList(3, 8, 15, 10, 12, 25, 7);
    Optional<Integer> secondHighestNum = numbers.stream().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst();
            secondHighestNum.ifPresent(System.out::println);
}

    import java.util.Optional;

public class SecondSmallest_31 {
    List<Integer> numbers = Arrays.asList(3, 7, 2, 5, 9, 1, 6);
    Optional<Integer> secondNumber = numbers.stream().sorted().skip(1).findFirst();
            secondNumber.ifPresent(System.out::println);
}

public class SkipFirstThreeElements_21 {
    List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
    List<String> new_list = words.stream().skip(3).collect(Collectors.toList());
            System.out.println(new_list);
}

public class SortByStringLength_28 {
    List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");
    List<String> sortedWordByLength = words.stream()
        .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
        .collect(Collectors.toList());
            System.out.println(sortedWordByLength);
}

    import java.util.Comparator;

public class SortStringByLastCharacter_51 {
    List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "kiwi");
    List<String> sortStringByLastCharacter = words.stream()
        .sorted(Comparator.comparingInt(word -> word.charAt(word.length() - 1)))
        .collect(Collectors.toList());
            System.out.println("Sorted by last character: "+sortStringByLastCharacter);
}

public class SquareList12 {
    List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);
    List<Integer> squareNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());
            System.out.println(squareNumbers);
}

public class SumOfElements15 {
    List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
    int sum = numbers.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Sum: "+sum);
}

class TransactionRecord {
    private String date;
    private int amount;
    //const, getter, setter
}

public class TransactionByDate_65 {
    List<TransactionRecord> transactionRecord = Arrays.asList(
        new TransactionRecord("2024-12-23", 100)
    );

    Map<String, Integer> sumByDate = transactionRecord.stream()
        .collect(
            Collectors.groupingBy(TransactionRecord::getDate,
                Collectors.summingInt(TransactionRecord::getAmount)
            ));

    //  sumByDate.forEach((date,amnt)-> System.out.println(date+": "+amnt));
            System.out.println("Date\t\tAmount");
            sumByDate.entrySet().

    stream()
                .

    sorted(Map.Entry.comparingByKey())
        .

    forEach(e ->System.out.println(e.getKey()+": "+e.getValue()));


}

public class WordFrequency10 {
    List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");
    Map<String, Long> freqMap = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
            System.out.println(freqMap);
}

}



