package practice_project_1;
import java.util.Arrays;

public class ArrayRightRotation {
    public static void main(String[] args) {
        int[] arr = {1, 9, 4, 5, 3, 7, 3, 0, 8, 2};
        int steps = 5;

        System.out.println("Original Array: " + Arrays.toString(arr));

        rightRotateArray(arr, steps);

        System.out.println("Right Rotated Array: " + Arrays.toString(arr));
    }

    public static void rightRotateArray(int[] arr, int steps) {
        int length = arr.length;
        steps = steps % length;
        reverseArray(arr, 0, length - 1);
        reverseArray(arr, 0, steps - 1);
        reverseArray(arr, steps, length - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
