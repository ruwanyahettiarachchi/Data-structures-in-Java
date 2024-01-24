package ArrayList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        // Creating a queue
        Queue<String> queue = new LinkedList<>();

        // Enqueuing elements
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");

        // Displaying the elements in the queue
        System.out.println("Elements in the queue:");
        for (String element : queue) {
            System.out.println(element);
        }

        // Dequeuing an element
        String dequeuedElement = queue.poll();
        System.out.println("\nDequeued Element: " + dequeuedElement);

        // Displaying the modified queue
        System.out.println("\nElements in the modified queue:");
        for (String element : queue) {
            System.out.println(element);
        }

        // Peeking at the front element without removing it
        String frontElement = queue.peek();
        System.out.println("\nFront Element (without removal): " + frontElement);
    }
}


