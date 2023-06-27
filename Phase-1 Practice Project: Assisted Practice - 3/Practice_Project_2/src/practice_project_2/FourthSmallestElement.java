package practice_project_2;
import java.util.Arrays;

public class FourthSmallestElement {
    public static void main(String[] args) {
        int[] list = {9, 3, 5, 1, 8, 2, 7, 6, 4};
        // Elements before sorting
        System.out.println("Before Sort List: " + Arrays.toString(list));
        
        int fourthSmallest = findFourthSmallest(list);
        
        // Elements after sorting
        System.out.println("After Sort List: " + Arrays.toString(list));
        
        //Printing the fourth smallest number
        System.out.println("Fourth Smallest Element: " + fourthSmallest);
    }
    
    public static int findFourthSmallest(int[] list) {
        if (list.length < 4) {
        	
        	// throwing exception if the list contain elements less than 4
            throw new IllegalArgumentException("List should contain at least 4 elements");
        }
        
        Arrays.sort(list); // Sort the list in ascending order
        
        return list[3]; // Return the fourth element from the sorted list
    }
}
