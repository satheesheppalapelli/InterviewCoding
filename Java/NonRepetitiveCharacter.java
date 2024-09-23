/*
Java Code to find the  first and second non-repetitive character in a string using Java Streams
Expected Output:
When you run this program with the input string "swiss", the output will be:

First non-repetitive character is: w
Explanation of Output:
In the string "swiss", the characters are counted as follows:
s: 3 occurrences
w: 1 occurrence
i: 1 occurrence

*/
import java.util.LinkedHashMap;  // Import LinkedHashMap for maintaining insertion order
import java.util.Map;            // Import Map interface
import java.util.Optional;       // Import Optional to handle possible null values
import java.util.stream.Collectors; // Import Collectors for stream operations

public class NonRepetitiveCharacter {
    
    // Method to find the first non-repetitive character in a given string
    public static char findFirstNonRepetitiveCharacter(String s) {
        // Create a frequency map using streams
        Map<Character, Long> countMap = s.chars() // Convert the string to an IntStream of character codes
                .mapToObj(c -> (char) c) // Convert each character code to a Character object
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())); 
                // Collect characters into a LinkedHashMap, counting occurrences
        
        // Find the first non-repetitive character
        Optional<Character> firstNonRepetitive = countMap.entrySet().stream() // Stream the entry set of the frequency map
                .filter(entry -> entry.getValue() == 1) // Filter to keep only entries with a count of 1
                .map(Map.Entry::getKey) // Map to the character keys
                // .skip(1) // Skip the first non-repetitive character to get the second non-repetitive character.
                .findFirst(); // Get the first non-repetitive character
        
        // Return the character or '\0' if not found
        return firstNonRepetitive.orElse('\0');
    }

    public static void main(String[] args) {
        String s = "swiss"; // Test string
        char result = findFirstNonRepetitiveCharacter(s); // Call the method to find the first non-repetitive character
        if (result != '\0') { // Check if a non-repetitive character was found
            System.out.println("First non-repetitive character is: " + result); // Print the result
        } else {
            System.out.println("No non-repetitive character found."); // Inform if no such character exists
        }
    }
}
