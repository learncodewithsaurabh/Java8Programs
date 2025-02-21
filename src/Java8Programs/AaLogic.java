package Java8Programs;

public class AaLogic {

    //Q66. How to  Find Employees By Department using the Java 8 Streams API?
    class Employee {
        private String name;
        private String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public String toString() {
            return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
        }
    }

    public class FindEmployeeByDepartment_66 {
        public static void main(String[] args) {
            List<Employee> employeeList = Arrays.asList(
                new Employee("Saurabh", "IT"),
                new Employee("Shubham", "HR"),
                new Employee("Sony", "IT"),
                new Employee("Rahul", "HR")
            );
            List<Employee> itEmployee = employeeList.stream()
                .filter(e -> "HR".equals(e.getDepartment()))
                .collect(Collectors.toList());
            itEmployee.forEach(System.out::println);
        }
    }


package Java8Programs.Q67;


    import java.util.Comparator;


    class Employee {
        private String name;
        private double salary;

        // Constructor
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        // Getters
        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', salary=" + salary + "}";
        }
    }

    public class FindHighestPaidEmployee_67 {
        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                new Employee("Rahul Sharma", 175000),
                new Employee("Anita Verma", 82000),
                new Employee("Vikas Gupta", 56000),
                new Employee("Priya Singh", 90000)
            );
            // Find the highest-paid employee
            Employee highestPaidEmp = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new RuntimeException("No employee found"));
            System.out.println("Highest Paid Employee = " + highestPaidEmp);
        }
    }

package Java8Programs.Q68;






    class Employee {
        private String empName;
        private String departmentName;
        private double salary;

        // Constructor
        public Employee(String empName, String departmentName, double salary) {
            this.empName = empName;
            this.departmentName = departmentName;
            this.salary = salary;
        }

        // Getters
        public String getEmpName() {
            return empName;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public double getSalary() {
            return salary;
        }
    }

    public class FindTotalSalaryByDepartment_68 {
        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                new Employee("Rajesh Kumar", "IT", 60000),
                new Employee("Priya Sharma", "HR", 55000),
                new Employee("Ankit Singh", "IT", 65000),
                new Employee("Neha Gupta", "Finance", 70000),
                new Employee("Vikas Yadav", "HR", 45000)
            );

            // Find/Calculate total salary by department using Java 8 Stream API.
            Map<String, Double> totalSalaryByDepartment = employees.stream()
                .collect(
                    Collectors.groupingBy(Employee::getDepartmentName,
                        Collectors.summingDouble(Employee::getSalary))
                );
            totalSalaryByDepartment.forEach((dept, salary) -> System.out.println(dept + " : " + salary));
        }
    }


package Java8Programs.Q69;


    import java.util.Comparator;



    class Employee {
        private String empName;
        private String departmentName;
        private double salary;

        public Employee(String empName, String departmentName, double salary) {
            this.empName = empName;
            this.departmentName = departmentName;
            this.salary = salary;
        }

        public String getEmpName() {
            return empName;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                "empName='" + empName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", salary=" + salary +
                '}';
        }
    }

    public class Top3HighestPaidEmployeesByDept_69 {
        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                new Employee("Saurabh", "IT", 120000),
                new Employee("Shubham", "IT", 150000),
                new Employee("Pooja", "HR", 80000),
                new Employee("David", "IT", 200000),
                new Employee("Gaurav", "IT", 250000),
                new Employee("Soni", "Finance", 95000)
            );
            // Find the Top 3 Highest-Paid Employees in IT Department
            List<Employee> top3HighestPaidEmployees = employees.stream()
                .filter(e -> "IT".equals(e.getDepartmentName()))
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());
            top3HighestPaidEmployees.forEach(System.out::println);
        }
    }







    /*
    Q. Write a program  to check if all elements in a list are positive using the Java 8 Streams API.
        Sample: 1
        Input:      5, 12, 18, 7, 21
        Output:      All positive? true

        Sample: 2
        Input:      5, 12, 18, 7, 21
        Output:     All positive? false
    */
    public class AllPositiveCheck_20 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(5, -12, 18, 7, 21);
            boolean allPostive = numbers.stream().allMatch(n -> n > 0);
            System.out.println("All positive? " + allPostive);
        }
    }




    import java.util.ArrayList;



    /* Q38. Write a program to find all subsets of a list using the Java 8 Streams API.
       Sample;	Input:  [ 1, 2, 3]
                Output: [ [ ], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3] ]
    */
    public class AllSubsets_38 {
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1, 2, 3);
            List<List<Integer>> subsets = new ArrayList<>();
            subsets.add(new ArrayList<>());

            for (Integer element : list) {
                List<List<Integer>> newSubsets = new ArrayList<>();

                for (List<Integer> subset : subsets) {
                    List<Integer> newSubset = new ArrayList<>(subset);
                    newSubset.add(element);
                    newSubsets.add(newSubset);
                }
                subsets.addAll(newSubsets);
            }
            System.out.println(subsets);
        }
    }








    /*
    Q24. Write a program to find the average of a list of integers
        using the Java 8 Streams API.
        Sample;
        Input:   1, 2, 3, 4, 5, 6
        Output: Average: 3.5
    */
    public class AverageOfList_24 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
            double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            System.out.println("Average: " + avg);
        }
    }








    /*Q. Write a program to
        Calculate Factorials of a List of Numbers
        using the Java 8 Streams API.
        Sample;
        Input:  [1, 2,  3,   4,    5,   6]
        Output: [1, 2, 6, 24, 120, 720]*/
    public class CalculateFactorials_58 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
            List<Integer> factorials = numbers.stream().map(CalculateFactorials_58::fact).collect(Collectors.toList());
            System.out.println(factorials);
        }

        private static Integer fact(int n) {
            return (n == 0) ? 1 : n * fact(n - 1);
        }
    }






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
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
            List<Integer> subList = Arrays.asList(3, 4, 5, 6);
            boolean contain = IntStream.rangeClosed(0, list.size() - subList.size()).anyMatch(i -> list.subList(i, i + subList.size()).equals(subList));
            System.out.println("Contain SubList:" + contain);
            //1, 2, 3
            // 2, 3, 4,
            //  3, 4, 5
        }

    }








    //Q5. Write a program to check if a list contains any word
    starting with 'A'
    using the
    Stream API.

    //Input: "Amit", "Suresh", "Animesh", "Vikram", "apple", "banana", "kiwi"
    public class CheckWordStartingWithA5 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("Amit", "Suresh", "Animesh", "Vikram", "apple", "banana", "kiwi");
            List<String> wordStartingWithA = words.stream()
                .filter(s -> s.startsWith("A") || s.startsWith("a"))
                .collect(Collectors.toList());
            if (!wordStartingWithA.isEmpty()) {
                System.out.println("Words starting with 'A' or 'a' is: " + wordStartingWithA);
            } else {
                System.out.println("No words starting with 'A' or 'a'.");
            }

        }
    }
/*output:
 Words starting with 'A' or 'a' is: [Amit, Animesh, apple]
 */








    import java.util.Set;


    /*Q19. Write a program  to collect odd numbers into a set using the Java 8 Streams API.
        Sample; 	Input:   1, 2, 3, 4, 5, 6, 7, 8, 9
             Output: [1, 3, 5, 7, 9]
    */
    public class CollectOddNumbersToSet_19 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            Set<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toSet());
            System.out.println(oddNumbers);
        }
    }









    /*
    Q26. Write a program to convert list of strings to a single concatenated string
        using the Java 8 Streams API.
        Sample;
                Input:  [ "apple", "banana", "orange" ]
                Output: apple, banana, orange
    */
    public class ConcatenateStrings_26 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "orange");
            String concateString = words.stream().collect(Collectors.joining(","));
            System.out.println(concateString);
        }
    }










    public class ConevrtToUppercase2 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("java", "Spring", "Saurabh", "Oracle");
            List<String> upperWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
            System.out.println(upperWords);

        }
    }
/*
 output:
 [JAVA, SPRING, SAURABH, ORACLE]
 */






    import java.util.HashSet;

    import java.util.Set;

    /* Q33. Write a program to convert a list of strings to a set using the Java 8 Streams API.
           Sample;
                Input:  [ "apple", "banana", "grape", "orange", "banana" ]
                Output: [ banana, orange, apple, grape ]
    */
    public class ConvertListToSet_33 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "banana");
            Set<String> wordSet = new HashSet<>(words);
            System.out.println(wordSet);
        }
    }







    /* Q40. Write a program to count the number of characters in a list of strings using the Java 8 Streams API.
        Sample;
            Input:   ["apple", "banana", "grape", "orange"]
            Output: Total number of characters: 22
    */
    public class CountCharactersInList_40 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "grape", "orange");
            int totalCharacters = words.stream().mapToInt(String::length).sum();
            System.out.println("Total number of characters: " + totalCharacters);
        }

    }







    /*Q54. Write a program to
           Count Distinct Elements in a List
           using the Java 8 Streams API, without using a Set.
           Sample;  Input:    [1, 2, 2, 3, 4, 4, 5, 6]
                   Output: Number of distinct elements: 6
        */
    public class CountDistinctElements_54 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6);
            long countDistinctNumber = numbers.stream().distinct().count();
            System.out.println("Number of distinct element: " + countDistinctNumber);
        }
    }










    /* Q42. Write a program to count occurrences of each element in a list using the Java 8 Streams API.
        Sample;	Input:  ["apple", "banana", "apple", "grape", "banana", "orange","banana"]
                Output: {orange=1, banana=3, apple=2, grape=1}
    */
    public class CountOccurrences_42 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "apple", "grape", "banana", "orange", "banana");
            Map<String, Integer> occurrence = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
            System.out.println(occurrence);
        }
    }







    /*
    Q37. Write a program to count palindromes in a list using the Java 8 Streams API.
       Sample;	Input:  ["madam", "apple", "racecar", "banana", "level"]
                Output: Number of palindromes: 3
    */
    public class CountPalindromes_37 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("madam", "apple", "racecar", "banana", "level");
            long count = words
                .stream()
                .filter(word -> new StringBuilder(word).reverse().toString().equals(word))
                .count();
            System.out.println("Number of palindroms: " + count);
        }
    }




    /*Q. Write a program to
         Count the Number of Digits in a String
         using the Java 8 Streams API.
        Sample;
         Input:  "Hello123"
         Output: Digit count: 3
    */
    public class CountStringDigits_61 {
        public static void main(String[] args) {
            String str = "Hello12345";
            long digitCount = str.chars().filter(Character::isDigit).count();
            System.out.println("Digit Count: " + digitCount);
        }
    }







    /* Q48. Write a program to
        Count Vowels in a List of Strings
        using the Java 8 Streams API.
        Sample; Input:  "Apple", "banana", "grape", "orange"
                Output: Total vowels: 10
    */
    public class CountVowels_48 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("Apple", "banana", "grape", "orange");
            long countVowel = words.stream()
                .flatMapToInt(String::chars)
                .filter(ch -> "AEIOUaeiou".indexOf(ch) != -1)
                .count();
            System.out.println("Total Vowels = " + countVowel);
        }
    }










    /*Q. Write a program to
        Create a Map from Lists
        using the Java 8 Streams API.
     Sample;
        Input List1: ["a", "b", "c"]
        Input List2: [ 1, 2, 3 ]
        Output: Created map: {a=1, b=2, c=3}*/
    public class CreateMapFromTwoLists_62 {
        public static void main(String[] args) {
            List<String> keys = Arrays.asList("a", "b", "c");
            List<Integer> values = Arrays.asList(1, 2, 3);
            Map<String, Integer> mapFromTwoList = keys.stream().collect(Collectors.toMap(k -> k, v -> values.get(keys.indexOf(v))));
            System.out.println("Created map from two list: " + mapFromTwoList);
        }
    }






    import java.util.stream.Stream;

    /* Q36. Write a program to generate list of first 10 Fibonacci numbers
        using the Java 8 Streams API.
           Sample;	Input:   termNumber = 10
                    Output: [ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ]
    */
    public class FibonacciNumbers_36 {
        public static void main(String[] args) {
            int termNumber = 10;
            List<Integer> fibonacciNumbers = Stream
                .iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(termNumber)
                .map(n -> n[0])
                .collect(Collectors.toList());
            System.out.println(fibonacciNumbers);
        }
    }









    public class FilterEvenNumbers1 {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 24);
            List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
            System.out.println(evenNumbers);
        }

    }
/*output:
 [2, 4, 6, 8, 10, 12]
*/








    /*
    Q25. Write a program  to filter strings containing a specific character
         using the Java 8 Streams API.
        Sample;
             Input:    "apple", "banana", "grape", "kiwi", "orange"
            Output: [ apple, banana, grape, orange ]
    */
    public class FilterStringsByCharacter_25 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "grape", "kiwi", "orange");
            List<String> filterWords = words.stream().filter(word -> word.contains("k")).collect(Collectors.toList());
            System.out.println(filterWords);
        }
    }






    import java.util.LinkedHashSet;
    import java.util.Set;


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
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.toCollection(LinkedHashSet::new));
            System.out.println(uniqueCharacters);
        }

    }








    /*Q. Write a program to
        Find the Average Length of Strings in a List
        using the Java 8 Streams API.
        Sample;
        Input:  ["apple", "banana", "kiwi"]
        Output: Average length: 5.0 */
    public class FindAverageLengthString_59 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "kiwi");
            double avgStringLength = words.stream().mapToInt(String::length).average().orElse(0);
            System.out.println("Average String Length: " + avgStringLength);
        }
    }







    /*Q. Write a program to
        Find the Element Closest to a Given Value
        using the Java 8 Streams API.
        Sample; Input:  [10, 22, 35, 33]
                        targetValue: 30
                Output: Closest to 30: 35  */
    public class FindClosestToValue_46 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 22, 35, 29);
            int targetValue = 30;
            int closedValue = numbers.stream()
                .min((n1, n2) -> Integer.compare(Math.abs(n1 - targetValue), Math.abs(n2 - targetValue)))
                .orElse(0);
            System.out.println("Closest value:" + closedValue);
        }
    }







    import java.util.Set;


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
            System.out.println("Common List Elements: " + commonListElement);
        }
    }






    import java.util.HashSet;

    import java.util.Set;


    //Q6. Write a program in Java to find duplicate elements in a list using the Stream API.
//Input:    1, 2, 3, 4, 5, 6, 3, 4, 7, 8, 6
    public class FindDuplicates6 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 3, 4, 7, 8, 6);
            Set<Integer> seen = new HashSet<Integer>();
            List<Integer> duplicates = numbers.stream()
                .filter(i -> !seen.add(i))
                .distinct()
                .collect(Collectors.toList());
            System.out.println(duplicates);

        }
    }
/*
 output:
 [3, 4, 6]
 */




    import java.util.Comparator;

    /*Q. Write a program to
        Find the First Longest Word in a Sentence
        using the Java 8 Streams API.
        Sample; Input:  My name is Saurabh Kumar, and I work at Capgemini as a Java Developer
                Output: Longest word: Capgemini
     */
    public class FindFirstLongestWord_47 {
        public static void main(String[] args) {
            String sentence = "My name is Saurabh Kumar, and I work at Capgemini as a Java Developer1";
            String longestString = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
            System.out.println("Longest Word: " + longestString);
        }
    }





    import java.util.HashSet;

    import java.util.Set;

    /*Q50. Write a program to
         Find the First Repeated Element in a List
         using the Java 8 Streams API.
         Sample;  Input:     [1, 2, 3, 4, 2, 5, 3, 6]
                 Output:  First repeated element: 2 */
    public class FindFirstRepeatedElement_50 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);
            Set<Integer> seen = new HashSet<>();
            int firstRepeated = numbers.stream()
                .filter(n -> !seen.add(n))
                .findFirst()
                .orElse(-1);
            System.out.println("First repeated element: " + firstRepeated);

        }
    }








    /*Q16. Write a program to find elements greater than 10 in a list using the Java 8 Streams API.
       Sample; 	Input:     5, 12, 18, 7, 21, 9, 14
                 Output: [12, 18, 21, 14]
     */
    public class FindGreaterThan10_16 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(5, 12, 18, 7, 21, 9, 14);
            List<Integer> numGreaterThan10List = numbers.stream().filter(n -> n > 10).collect(Collectors.toList());
            System.out.println(numGreaterThan10List);
        }
    }









    /*Q52. Write a program to
        Find the Difference Between Two Lists
        using the Java 8 Streams API.
        Sample;
                Input:     [1, 2, 3, 4, 5]
                           [3, 4, 5, 6, 7]
                Output: Difference: [1, 2]  */
    public class FindListDifference_52 {
        public static void main(String[] args) {
            List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
            List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
            List<Integer> diffValue = list1.stream().filter(num -> !list2.contains(num)).collect(Collectors.toList());
            System.out.println("Difference Value = " + diffValue);
        }
    }








    /*Q. Write a program to
        Find the Longest Palindrome in a List
        using the Java 8 Streams API.
           Sample;  Input1:    ["madam", "hello", "civic", "noon", "level", "racecar", "kayak"]
                    Output1:   Longest palindrome(s): [racecar]
                    Input2:    ["madam", "hello", "civic", "noon", "level", "kayak"]
                    Output2:  Longest palindrome(s): [madam, civic, level, kayak] */
    public class FindLongestPalindrome_56 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("madam", "hello", "civic", "noon", "level", "kayak");
            List<String> palindromes = words.stream()
                .filter(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());
            if (palindromes.isEmpty()) {
                System.out.println("No Palindrome Found!");
            } else {
                int maxLength = palindromes.stream().mapToInt(String::length).max().orElse(0);

                List<String> longestPalindromes = palindromes.stream()
                    .filter(word -> word.length() == maxLength)
                    .collect(Collectors.toList());
                System.out.println("Longest palindrome(s): " + longestPalindromes);
            }

        }
    }








    /*Q. Write a program to
        finds the longest word(s) in a given sentence
        using the Java 8 Streams API.
        Sample Input:  "My name is Saurabh, and I work at Capgemini as a Java Developer"
               Output: Longest word(s): [Capgemini, Developer]*/
    public class FindLongestWordsInSentence_57 {
        public static void main(String[] args) {
            String sentence = "My name is Saurabh, and I work at Capgemini as a Java Developer";
            int maxLength = Arrays.stream(sentence.split(" ")).mapToInt(String::length).max().orElse(0);

            List<String> longestWord = Arrays.stream(sentence.split(" "))
                .filter(w -> w.length() == maxLength)
                .collect(Collectors.toList());
            System.out.println("Longest Word(s): " + longestWord);
        }
    }






    import java.util.Optional;

    /*Q23. Write a program to find the minimum value in a list using the Java 8 Streams API.
        Sample;
               Input:    12, 45, 23, 5, 87, 19
               Output: 5
    */
    public class FindMinimum_23 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(12, 45, 23, 5, 87, 19);
            Optional<Integer> min = numbers.stream().min(Integer::compareTo);
            min.ifPresent(value -> System.out.println("Minimum number are: " + value));
        }
    }







    import java.util.Optional;

    /* Q49. Write a program to
    Find the Shortest String in a List
    using the Java 8 Streams API.
       Sample; Input:   ["apple", "banana", "kiwi", "orange", "grape"]
               Output:  Shortest String in a List = kiwi
    */
    public class FindShortestString_49 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");
            Optional<String> shortestString = words.stream().min((s1, s2) -> Integer.compare(s1.length(), s2.length()));
            shortestString.ifPresent(w -> System.out.println("Shortest String in a List = " + w));
        }
    }




    import java.util.LinkedHashMap;


    /*Q41. Write a program to find first non-repeated character in a string using the Java 8 Streams API.
        Sample;	Input:  input = "Saurabh";
                Output: S
    */
    public class FirstNonRepeatedCharacter_41 {
        public static void main(String[] args) {
            String input = "Saurabh";
            Map<Character, Integer> characterCount = new LinkedHashMap<>();
            for (char c : input.toCharArray()) {
                characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
            }
            characterCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);
        }
    }






/*Q. Write a program to find the first element in a list using the Java 8 Streams API.
   Sample;
       Input: "apple", "banana", "orange", "grape"
	   Output:   apple
 */


    public class FirstWordGet14 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "orange", "grape");
            words.stream().findFirst().ifPresent(System.out::println);
        }
    }








    /*
    Q8. Write a program in java to flatten a list of lists using the stream api.
       Sample;
            Input:     1, 2, 3
                       4, 5, 6
                       7, 8, 9
            Output:  [ 1, 2, 3, 4, 5, 6, 7, 8, 9 ]*/
    public class FlattenList8 {
        public static void main(String[] args) {
            List<Integer> list2 = Arrays.asList(4, 5, 6);
            List<Integer> list3 = Arrays.asList(7, 8, 9);
            List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1, 2, 3), list2, list3);
            List<Integer> flatList = listOfList.stream().flatMap(List::stream).collect(Collectors.toList());
            System.out.println(flatList);

        }
    }






    import java.util.Optional;

    /* Q43. Write a program to find the maximum product of two integers in a list using the Java 8 Streams API.
    Sample Test cases:
    Case 1: Input with Positive and Negative Numbers   Input: [-5, -6, 1, 2]      Output: Maximum product of two integers = 30
    Case 2: Input with Mixed Positive and Negative No. Input: [3, 5, -2, 9, 1, 7] Output: Maximum product of two integers = 63
    Case 3: Input with Only Two Numbers                Input: [3, 4]              Output: Maximum product of two integers = 12
    Case 4: Input with Duplicate Numbers               Input: [3, 3, 5, 7]        Output: Maximum product of two integers = 35
    Case 5: Input with All Negative Numbers            Input: [-3, -4, -5]        Output: Maximum product of two integers = 20
    Case 6: Input with One Element (Invalid Case)      Input: [1]                 Output: List must contain at least two integers.
    */
    public class GetMaxProductOfTwoIntegers_43 {
        public static void main(String[] args) {

            List<Integer> numbers = Arrays.asList(3, 3, 3, 7);

            if (numbers == null || numbers.isEmpty()) {
                System.out.println("List is empty...");
                return;
            }

            if (numbers.size() < 2) {
                System.out.println("List must contain at least two integers.");
                return;
            }

            Optional<Integer> maxProduct = numbers.stream()
                .flatMap(i -> numbers.stream().filter(j -> !i.equals(j)).map(j -> i * j))
                .max(Integer::compareTo);
            if (maxProduct.isPresent()) {
                System.out.println("Maximum product of two integers: " + maxProduct.get());
            } else {
                System.out.println("No product could be calculated");
            }

        }
    }









//Q4. Write a program in java to group strings by their length using the Stream API.

//Input: "apple", "banana", "pear", "grape", "kiwi", "orange"

    public class GroupByStringLength4 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "pear", "grape", "kiwi", "orange");
            Map<Integer, List<String>> groupByLength = words.stream().collect(Collectors.groupingBy(String::length));
            System.out.println(groupByLength);
        }
    }
/*
 Output:
{4=[pear, kiwi], 5=[apple, grape], 6=[banana, orange]}
 */










    /*Q. Write a program to
        Group strings by their length
        using the Java 8 Streams API.
      Sample;  Input: ["apple", "bat", "cat", "banana", "grape"]
        Output: 3: [bat, cat]
                5: [apple, grape]
                6: [banana] */
    public class GroupStringsByLength_63 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "bat", "cat", "banana", "grape");
            Map<Integer, List<String>> groupByLengthOfString = words.stream().collect(Collectors.groupingBy(String::length));
            groupByLengthOfString.forEach((length, group) -> System.out.println(length + ":" + group));
        }
    }





    /*Q17. Write a program  to find the length of the longest string in a list using the Java 8 Streams API.
       Sample; 	Input:  "apple", "banana", "grapefruit", "kiwi"
                 Output: Longest string length: 10
     */
    public class LongestStringLength_17 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "grapefruit", "kiwi");
            int longStrLength = words.stream().mapToInt(String::length).max().orElse(0);
            System.out.println("Longest string length: " + longStrLength);
        }
    }






    import java.util.Optional;

    public class MaxValue3 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 50, 30, 45, 88);
            Optional<Integer> maxValue = numbers.stream().max(Integer::compareTo);
            System.out.println(maxValue);
        }
    }








    /*Q34. Write a program to find the median value in a list of integers
        using the Java 8 Streams API.
          Sample1;
                  Input:  [1, 3, 5, 7, 9]
                  Output: Median: 5.0
        Sample 2;
                 Input:   [1, 3, 5, 7, 9, 11]
                 Output: Median: 6.0
    */
    public class MedianValue_34 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 11);
            List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
            int size = numbers.size();
            double median = size % 2 == 0 ? (sortedNumbers.get(size / 2 - 1) + sortedNumbers.get(size / 2)) / 2.0 : sortedNumbers.get(size / 2);
            System.out.println("Median: " + median);
        }
    }








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
            List<String> list = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
            System.out.println(list);
        }
    }







    /*Q. Write a program to
        Find the Most Frequent Element in List
        using the Java 8 Streams API.
    Test Cases:
        1. Non-empty list with a unique most frequent element:
            Input: [1, 2, 2, 3]
            Output: Most frequent element(s): [2]
        2. Empty list:
            Input: []
            Output: The list is empty. No frequent element to find.
        3. Non-empty list with multiple elements having the same maximum frequency:
            Input: [1, 2, 3, 2, 1, 3, 2]
            Output: Most frequent element(s): [2]
        4. List with one element:
            Input: [7]
            Output: Most frequent element(s): [7]
        5. Tie Case with multiple elements having the same maximum frequency:
            Input: [1, 2, 3, 2, 1, 3]
            Output: Most frequent element(s): [1, 2, 3]
     */
    public class MostFrequentElement_60 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 1, 2, 3, 3);
            if (numbers.isEmpty()) {
                System.out.println("The list is empty. No frequent element to find.");
            } else {
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
    }







    /*
    Q. Write a program  to check if no elements in a list are negative using the Java 8 Streams API.
        Sample; 	Input:   1, 5, 10, 15
        Output: No negative numbers? true
    */
    public class NoNegativeNumbers_22 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 5, 10, 15);
            boolean noNegativeNumbers = numbers.stream().noneMatch(n -> n < 0);
            System.out.println("No negative numbers? " + noNegativeNumbers);
        }
    }







    /*Q. Write a program to
        Given a list of integers, find out all the numbers starting with 1 (or specific number)
        using the Java 8 Streams API.
        Sample;
         Input: [10, 15, 8, 49, 25, 98, 32]
         Output: 10
                 15
    */
    public class NumberStartingWithOne_64 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 222);
            numbers.stream().map(s -> s + "").filter(s -> s.startsWith("2")).forEach(System.out::println);
        }
    }









    /* Q32. Write a program to find palindromic strings in a list using the Java 8 Streams API.
        Sample; Input:   ["madam", "apple", "racecar", "banana", "level" ]
                Output:  [ madam, racecar, level]
    */
    public class PalindromicStrings_32 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("madam", "apple", "racecar", "banana", "level");
            List<String> palindromicWord = words.stream()
                .filter(word -> new StringBuilder(word)
                    .reverse()
                    .toString()
                    .equals(word))
                .collect(Collectors.toList());
            System.out.println(palindromicWord);
        }
    }









    /*Q9. Write a program in java to partition numbers into even and odd  using the stream api.
          Sample;	Input:     List        1, 2, 3, 4, 5, 6, 7, 8, 9, 10
                Output:    Even List: [ 2, 4, 6, 8, 10 ]
                              Odd List:  [ 1, 3, 5,  7, 9 ]*/
    public class PartitionByEvenOdd9 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
            System.out.println("Even List: " + partitioned.get(true));
            System.out.println("Odd List: " + partitioned.get(false));

        }
    }








    /*
    Q27. Write a program  to collect prime numbers from a list using the Java 8 Streams API.
        Sample;
            Input:   [ 2, 3, 4, 5, 6, 7, 8, 9, 10 ]
            Output:  [ 2, 3, 5, 7 ]
    */
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

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
            List<Integer> primeNumberList = numbers.stream()
                .filter(PrimeNumbers_27::isPrimeNumber)
                .collect(Collectors.toList());
            System.out.println(primeNumberList);
        }

    }







    /* Q29 Write a program to calculate the product of all elements in a list using the Java 8 Streams API.
          Sample;	Input:   [ 1, 2, 3, 4, 5 ]
                    Output:   Product: 120
    */
    public class ProductOfList_29 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            int product = numbers.stream().reduce(1, (a, b) -> a * b);
            System.out.println("Product: " + product);
        }
    }








    /*
    Q. Write a program to remove duplicate words from a list using the Java 8 Streams API.
    Q. What is the role of the distinct() method in Java Streams?
    Q. How to collect the result of a stream operation into a new list in Java?
    Q. How to create a list of words and remove duplicates using Java 8 Stream API?
    Q. How to eliminate duplicate elements in a list using Java's Collectors.toList() method?
    Q. How to use Arrays.asList() to initialize a list and remove duplicate words in Java?
    Q. How can you print the unique elements from a list using Java Streams?
    Q. What is the purpose of collect(Collectors.toList()) in the Java Stream API?
    Sample:
    Input:  "apple", "banana", "apple", "orange", "banana", "grape"
    Output:  [apple, banana, orange, grape]
     */
    public class RemoveDuplicateWords13 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
            List<String> uniqueWordList = words.stream().distinct().collect(Collectors.toList());
            System.out.println(uniqueWordList);
        }
    }








    /*Q35. Write a program to remove duplicates from a list of integers
        using the Java 8 Streams API.
           Sample;	Input:  [1, 2, 3, 4, 2, 5, 3, 6, 1]
                    Output: [1, 2, 3, 4, 5, 6]
    */
    public class RemoveDuplicatesInteger_35 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6, 1);
            List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
            System.out.println(uniqueNumbers);
        }

    }









    /* Q30. Write a program to remove elements less than 5 from a list using the Java 8 Streams API.
        Sample; Input:   [ 3, 7, 2, 5, 9, 1, 6 ]
                Output:  [7, 5, 9, 6] */
    public class RemoveLessThanFive_30 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(3, 7, 2, 5, 9, 1, 6);
            List<Integer> filteredNumbers = numbers.stream().filter(n -> n >= 5).collect(Collectors.toList());
            System.out.println(filteredNumbers);
        }

    }








    //Q7. Write a program in Java to remove Null Values from a List using the Stream API.
//Input: "apple", null, "banana", null, "grape", "kiwi, null
    public class RemoveNullValues7 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", null, "banana", null, "grape", "kiwi", null);
            List<String> nonNullWords = words.stream().filter(word -> word != null).collect(Collectors.toList());
            System.out.println(nonNullWords);
        }
    }
//output: [apple, banana, grape, kiwi]








    /*Q53. Write a program to
        Reverse the Characters of Each String in a List
        using the Java 8 Streams API.
        Sample; Input:  ["apple", "banana", "cherry"]
                Output: [elppa, ananab, yrrehc]  */
    public class ReverseCharactersInStrings_53 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "cherry");
            List<String> reverseWord = words.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());
            System.out.println("Reverse Words: " + reverseWord);
        }
    }






    import java.util.Collections;



    /*Q39. Write a program to reverse a list of strings using the Java 8 Streams API.
        Sample;	Input:   ["apple", "banana", "orange", "grape", "kiwi"]
                Output:  [ kiwi, grape, orange, banana, apple ]
    */
    public class ReverseList_39_a {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
            List<String> reverseWords = words.stream().collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                Collections.reverse(list);
                return list;
            }));
            System.out.println(reverseWords);
        }
    }





    import java.util.Collections;


    /*Q39. Write a program to reverse a list of strings using the Java Collections.
        Sample;	Input:   ["apple", "banana", "orange", "grape", "kiwi"]
                Output:  [ kiwi, grape, orange, banana, apple ]
    */
    public class ReverseList_39_b {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
            Collections.reverse(words);
            System.out.println(words);
        }
    }






    import java.util.Optional;

    /*Q18. Write a program  to find the second-highest element in a list using the Java 8 Streams API.
       Sample; 	Input: 3, 8, 15, 10, 12, 25, 7
                 Output: 15
     */
    public class SecondHighestElement_18 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(3, 8, 15, 10, 12, 25, 7);
            Optional<Integer> secondHighestNum = numbers.stream().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst();
            secondHighestNum.ifPresent(System.out::println);
        }
    }






    import java.util.Optional;

    /* Q31. Write a program to find the second-smallest element in a list using the Java 8 Streams API.
        Sample; Input:   [ 3, 7, 2, 5, 9, 1, 6 ]
                Output:    2
    */
    public class SecondSmallest_31 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(3, 7, 2, 5, 9, 1, 6);
            Optional<Integer> secondNumber = numbers.stream().sorted().skip(1).findFirst();
            secondNumber.ifPresent(System.out::println);
        }
    }



/*Q. Write a program  to skip the first 3 elements in a list using the Java 8 Streams API.
    Sample; 	Input:   "apple", "banana", "orange", "grape", "kiwi"
    Output: [grape, kiwi]
 */





    public class SkipFirstThreeElements_21 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
            List<String> new_list = words.stream().skip(3).collect(Collectors.toList());
            System.out.println(new_list);
        }
    }








    /*
    Q28. Write a program  to sort list of strings by length
         using the Java 8 Streams API.
        Sample;
            Input:  ["apple", "banana", "kiwi", "orange", "grape"]
            Output: [ "kiwi", "apple", "grape", "orange", "banana" ]
    */
    public class SortByStringLength_28 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");
            List<String> sortedWordByLength = words.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());
            System.out.println(sortedWordByLength);
        }

    }





    import java.util.Comparator;



    /*Q51. Write a program to
        Sort Strings by Their Last Character
        using the Java 8 Streams API.
       Sample; Input:     ["apple", "banana", "grape", "orange", "kiwi"]
               Output:   Sorted by last character:[banana, apple, grape, orange, kiwi]
     */
    public class SortStringByLastCharacter_51 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "kiwi");
            List<String> sortStringByLastCharacter = words.stream()
                .sorted(Comparator.comparingInt(word -> word.charAt(word.length() - 1)))
                .collect(Collectors.toList());
            System.out.println("Sorted by last character: " + sortStringByLastCharacter);
        }
    }








    /*
    Q12. Write a program to Convert List of Integers to Their Squares using the Java 8 Streams API?
    Q#.	How to square each element of a list using Java 8 Streams?
    Q#.	How to apply the map() function to transform a list in Java 8?
    Q#.	How to use Java Streams to generate a list of squared values from an integer list?
    Q#.	What is the Java 8 stream method to calculate the square of all elements in a list?
    Q#.	How to use the map() method to perform element-wise operations in a stream in Java 8?
       Sample;	Input:     List:    2, 3, 4,  5,  6
                Output:    List:  [ 4, 9, 16, 25, 36 ]
    */
    public class SquareList12 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);
            List<Integer> squareNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());
            System.out.println(squareNumbers);
        }
    }







    /*Q15. Write a program to calculate the sum of all elements in a list using the Java 8 Streams API.
       Sample;	Input:  2, 4, 6, 8, 10
                Output: Sum: 30
    */
    public class SumOfElements15 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
            int sum = numbers.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Sum: " + sum);
        }
    }









    /*Q65. How to find the sum of transaction amounts for each day from a given list of transactions and sort them by date
        using the Java 8 Streams API?
        Sample Input: A list of transactions where each transaction contains a date and an amount:
                              Date         Amount
                            2024-12-23      100
                            2024-12-24      200
                            2024-12-25      300
                            2024-12-23      400
                            2024-12-24      500 */
    class TransactionRecord {
        private String date;
        private int amount;

        public TransactionRecord(String date, int amount) {
            this.date = date;
            this.amount = amount;
        }

        public String getDate() {
            return date;
        }

        public int getAmount() {
            return amount;
        }
    }

    public class TransactionByDate_65 {
        public static void main(String[] args) {
            List<TransactionRecord> transactionRecord = Arrays.asList(
                new TransactionRecord("2024-12-23", 100),
                new TransactionRecord("2024-12-24", 200),
                new TransactionRecord("2024-12-25", 300),
                new TransactionRecord("2024-12-24", 400),
                new TransactionRecord("2024-12-25", 500)
            );

            Map<String, Integer> sumByDate = transactionRecord.stream()
                .collect(
                    Collectors.groupingBy(TransactionRecord::getDate,
                        Collectors.summingInt(TransactionRecord::getAmount)
                    ));

            //  sumByDate.forEach((date,amnt)-> System.out.println(date+": "+amnt));

            System.out.println("Date\t\tAmount");
            sumByDate.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));


        }
    }









    /*Q10. Q. How to find the frequency of elements in a list using Java 8 Streams?
    or
    Q. How to group elements in a list and count their occurrences using Java 8?
    or
    Q. How to use Collectors.groupingBy and Collectors.counting to calculate element frequency in a list?
    or
    Q. How to create a frequency map from a list of strings using Java Streams?
    or
    Q. How to use Stream API to generate a map of element frequencies?
     Sample;
            Input:    "apple", "banana", "apple", "orange", "banana", "banana"
             Output:   {apple=2, banana=3, orange=1}
    */
    public class WordFrequency10 {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");
            Map<String, Long> freqMap = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
            System.out.println(freqMap);
        }

    }

}



