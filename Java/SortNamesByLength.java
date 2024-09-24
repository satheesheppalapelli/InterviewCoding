/*
Lambdas:

Lambdas are a concise way to express instances of functional interfaces. 
Here’s an example where we use a lambda to sort a list of strings by length.

lambda (a, b) -> Integer.compare(a.length(), b.length()) replaces the need for a verbose anonymous inner class and is more readable.
*/

import java.util.Arrays;
import java.util.List;

public class SortNamesByLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Satheesh", "lana", "Mike", "Jennifer");

        // Sort names by length using a lambda expression
        names.sort((a, b) -> Integer.compare(a.length(), b.length()));

        // Print the sorted list
        names.forEach(System.out::println);
    }
}
