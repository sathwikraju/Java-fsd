
package project_1;

public class Project1 {
	public static void main(String[] args) {
		
		// Implicit type casting (widening)
	    int num1 = 100;
	    long num2 = num1; // Implicit casting from int to long
	    System.out.println("Implicit casting - long value: " + num2);
	        
	    
	    // Explicit type casting (narrowing)
	    double num3 = 3.14;
	    int num4 = (int) num3; // Explicit casting from double to int
        System.out.println("Explicit casting - int value: " + num4);
        }
	}

