package practice_project_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);

            int result = 10 / number;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
        	
        	// it is printed when the entered value is not a number.
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (ArithmeticException e) {
        	
        	// it is printed when the entered value is zero.
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
        	
        	// irrespective of the value this finally block is executed.
            System.out.println("End of program.");
            scanner.close();
        }
    }
}
