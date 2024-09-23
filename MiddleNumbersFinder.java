/*
Java Code
To find the middle number(s) from a list of numbers using Java Streams, 
you can follow this approach. Depending on whether the number of elements in the list is even or odd:
you can modify the //code to either return the middle element (for odd-length arrays) or the two middle //elements (for even-length arrays).

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


// public class MiddleNumbersFinder {
//   public static void main(String args[]) {
//     int[] numbers = {15, 9, 8, 4, 2};  // Example with even length
        
//         int[] sortedNumbers = Arrays.stream(numbers)
//                 .sorted()  // Sort the array
//                 .toArray(); // Collect sorted elements into an array
        
//         int len = sortedNumbers.length;
        
//         if (len % 2 == 1) {
//             // If the array length is odd, return the single middle element
//             int middle = sortedNumbers[len / 2];
//             System.out.println("Middle number: " + middle);
//         } else {
//             // If the array length is even, return the two middle elements
//             int middle1 = sortedNumbers[(len / 2) - 1];
//             int middle2 = sortedNumbers[len / 2];
//             System.out.println("Middle numbers: " + middle1 + " and " + middle2);
//         }
//     }
// }
