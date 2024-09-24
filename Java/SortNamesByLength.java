/*
Java code to implement the use a lambda Expression to sort a list of strings by length.
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
