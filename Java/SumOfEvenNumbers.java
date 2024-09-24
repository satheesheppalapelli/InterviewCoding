/*
Streams:

Streams allow you to process data in a declarative way. 
Here’s an example of filtering a list of integers and finding their sum.

Stream API makes it easy to filter the list and compute the sum in a readable, functional way.
*/

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Use Stream to filter even numbers and sum them
        int sumOfEvenNumbers = numbers.stream()
                                      .filter(n -> n % 2 == 0) // Filter even numbers
                                      .mapToInt(Integer::intValue) // Convert to int
                                      .sum(); // Sum them

        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
    }
}
