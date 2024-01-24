package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        
        // Creating an ArrayList of integers
        ArrayList<Integer> integerList = new ArrayList<>();

        // Adding elements to the ArrayList
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        // Accessing and displaying the elements of the array list
        System.out.println("Elements in the ArrayList:");
        for (Integer element : integerList)
        {
            System.out.println(element);
        }

        // Removing an element
        integerList.remove(Integer.valueOf(2));

        // Modifying an element
        integerList.set(0, 10);

        // Displaying the modified ArrayList
        System.out.println("\nModified Elements in the ArrayList:");
        for (Integer element : integerList)
        {
            System.out.println(element);
        }
    }
}
