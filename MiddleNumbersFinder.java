/*
Java Code
To find the middle number(s) from a list of numbers using Java Streams, 
you can follow this approach. Depending on whether the number of elements in the list is even or odd:

1. If the list is odd in size, there will be one middle element.
2. If the list is even in size, there will be two middle elements.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MiddleNumbersFinder {

    public static List<Integer> findMiddleNumbers(List<Integer> numbers) {
      
        int size = numbers.size();
      
        return numbers.stream()
                .sorted() // Sort the list to ensure order
                .skip((size - 1) / 2) // Skip half of the elements for odd or even
                .limit(size % 2 == 0 ? 2 : 1) // Pick 1 if odd size, 2 if even
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbersOdd = Arrays.asList(3, 5, 1, 2, 4);
        List<Integer> numbersEven = Arrays.asList(8, 3, 5, 1, 2, 4);
        
        System.out.println("Middle number(s) for odd list: " + findMiddleNumbers(numbersOdd));
        System.out.println("Middle number(s) for even list: " + findMiddleNumbers(numbersEven));
    }
}
