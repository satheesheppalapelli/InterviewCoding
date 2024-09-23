/*
Java code
convert a stream of strings to lowercase in Java using Java Streams, 
you can do this easily using the map method in combination with the String::toLowerCase method.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLowerCase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("HELLO", "WORLD", "JAVA", "STREAMS");

        // Convert all strings to lowercase using Streams
        List<String> lowerCaseStrings = strings.stream()                          //  is used to create a stream from the list.
                                               .map(String::toLowerCase)          //  is used to transform each string to lowercase
                                               .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase()) //  capitalizes the first letter and append the rest of the string lowercase.
                                               .collect(Collectors.toList());    // collects the transformed strings into a new list

        System.out.println(lowerCaseStrings);
    }
}
