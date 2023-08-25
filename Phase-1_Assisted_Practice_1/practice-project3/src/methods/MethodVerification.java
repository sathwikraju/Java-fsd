package methods;
public class MethodVerification {

    // Method with no parameters
    public static void greet() {
        System.out.println("Hello! How are you?");
    }

    // Method with parameters
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method with return value and parameter
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Calling methods with no parameters
        greet();

        // Calling methods with parameters
        int sum = addNumbers(5, 7);
        System.out.println("Sum: " + sum);

        // Calling methods with return values
        int number = 10;
        boolean isEvenNumber = isEven(number);
        System.out.println(number + " is even? " + isEvenNumber);
    }
}
