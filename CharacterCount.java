/* Java code implement the character count functionality using Java Streams
while treating upper-case and lower-case letters differently and 
ignoring non-alphabetic characters.
*/

import java.util.*;
import java.util.stream.Collectors;


public class CharacterCount {
  public static void main(String args[]) {
     
        // Input string
        // String str = "Hello World! 123 AaBb#";
        String str = "Satheesh Eppalapelli";
        
        // Creating a LinkedHashMap to maintain insertion order and count character occurrences
        Map<Character, Long> map = str
                //.toLowerCase()         // Convert the string to lower case
                .chars()                 // converts the string into an IntStream of character codes (ASCII values).
                .filter(c -> c != ' ')        // Omit spaces by filtering them out
                // .filter(Character::isLetter) // Omit non-alphabetic characters
                .mapToObj(c -> (char) c)        // Convert the int stream to a Character stream (each character code back to a Character object)
                .collect(Collectors.groupingBy( // Group by the character itself
                    c -> c,                    // Character as the key
                    LinkedHashMap::new,        // Use LinkedHashMap to maintain order
                    Collectors.counting())      // Count occurrences of each character
                );
        
        // Print the result
        System.out.println(map);
  }
}
