package practice_project_9;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Insert elements into the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println("Queue after inserting elements: " + queue);

        // Remove element from the front of the queue
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Queue after removing an element: " + queue);
    }
}
