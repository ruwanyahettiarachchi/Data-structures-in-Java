package ArrayList;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Displaying the elements in the stack
        System.out.println("Elements in the stack:");
        for (Integer element : stack) 
        {
            System.out.println(element);
        }

        // Popping / removing an element from the stack
        Integer poppedElement = stack.pop();
        System.out.println("\nPopped Element: " + poppedElement);

        // Displaying the modified stack
        System.out.println("\nElements in the modified stack:");
        for (Integer element : stack) {
            System.out.println(element);
        }

        // Peeking at the top element without removing it
        Integer topElement = stack.peek();
        System.out.println("\nTop Element (without removal): " + topElement);
    }
}

