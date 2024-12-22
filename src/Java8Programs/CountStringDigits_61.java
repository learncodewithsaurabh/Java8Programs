package Java8Programs;

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
      long digitCount =   str.chars().filter(Character::isDigit).count();
        System.out.println("Digit Count: "+digitCount);
    }
}
