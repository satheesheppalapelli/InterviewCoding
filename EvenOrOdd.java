/*
Java code to find the even and odd numbers together using a single Java stream.
*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOrOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 9, 8, 4, 2, 7);

        // Partition numbers into even and odd using a single stream
        Map<Boolean, List<Integer>> groupedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));  // true for even, false for odd

        List<Integer> evenNumbers = groupedNumbers.get(true);  // Get even numbers
        List<Integer> oddNumbers = groupedNumbers.get(false);  // Get odd numbers

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
