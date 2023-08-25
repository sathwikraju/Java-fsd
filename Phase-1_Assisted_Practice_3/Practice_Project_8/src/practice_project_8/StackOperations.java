package practice_project_8;

import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Insert elements into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack after inserting elements: " + stack);

        // Remove element from the stack
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Stack after removing an element: " + stack);
    }
}
