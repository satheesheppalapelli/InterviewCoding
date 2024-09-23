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
        List<String> lowerCaseStrings = strings.stream()
                                               .map(String::toLowerCase)
                                               .collect(Collectors.toList());

        System.out.println(lowerCaseStrings);
    }
}
