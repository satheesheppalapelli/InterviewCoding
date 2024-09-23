/*
Java code To convert a list of strings to a map where the keys are the strings and the values are their counts 
(i.e., how many times each string appears), you can use a LinkedHashMap. This ensures that the insertion order of the strings is maintained.
*/

import java.util.*;

public class StringCountWithLinkedHashMap {
    public static void main(String[] args) {
        // List of strings (input)
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        // Create a LinkedHashMap to store the string counts
        LinkedHashMap<String, Integer> stringCountMap = new LinkedHashMap<>();

        // Loop through the list of strings
        for (String str : strings) {
            // If the string is already in the map, increment its count
            if (stringCountMap.containsKey(str)) {
                stringCountMap.put(str, stringCountMap.get(str) + 1);
            } else {
                // If the string is not in the map, add it with a count of 1
                stringCountMap.put(str, 1);
            }
        }

        // Print the result
        for (Map.Entry<String, Integer> entry : stringCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
