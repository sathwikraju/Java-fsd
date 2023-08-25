package practice_project_7;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0; // index for arr1
        int j = 0; // index for arr2
        int k = 0; // index for mergedArray

        // Compare elements from both arrays and add the smaller element to the mergedArray
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Add remaining elements from arr1, if any
        while (i < n1) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // Add remaining elements from arr2, if any
        while (j < n2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
