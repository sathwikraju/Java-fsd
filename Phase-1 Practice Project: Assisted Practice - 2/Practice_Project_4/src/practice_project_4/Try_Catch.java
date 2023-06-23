package practice_project_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {
    
    public static void main(String[] args) {
        
        int num1, num2;
        
        try (Scanner number = new Scanner(System.in)) {
        	try {
        		System.out.println("Enter first number: ");
        		num1 = number.nextInt();
        		System.out.println("Enter second number: ");
        		num2 = number.nextInt();
        		
        		System.out.println("The number is: "+ (num1+num2));
        	} catch(InputMismatchException e){e.printStackTrace();}
			
		}
        
        System.out.println("End of the program...");
        
    }
}
