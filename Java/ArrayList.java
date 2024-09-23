/*
Java, arrays have a fixed size, so they can't grow or shrink dynamically. 
However, you can use other data structures like ArrayList which provide dynamic resizing. 
If you want to manage growing and shrinking arrays using Java Streams, 
you can achieve this by using collections like ArrayList and then converting them back to arrays if needed.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList {
  public static void main(String args[]) {
    // Create a list with initial values
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Add a new element dynamically
        list.add(6); // The list now grows to size 6
        
        // Remove an element dynamically
        list.removeIf(e -> e == 2); // Removes element '2', the list now shrinks

        // Remove an element at index position dynamically
        list.remove(2); // Removes element at index position '2', the list now shrinks

        for (Integer i : list) {
            System.out.print(i + " ");
        }
        
        // Process the list using Java Streams (for example, filtering even numbers)
        List<Integer> processedList = list.stream()
                                          .filter(e -> e % 2 == 0)
                                          .collect(Collectors.toList());

        // Convert back to array if needed
        Integer[] dynamicArray = processedList.toArray(new Integer[0]);

        // Print the resulting dynamic array
        for (Integer i : dynamicArray) {
            System.out.print(i + " ");
        }
  }
}
