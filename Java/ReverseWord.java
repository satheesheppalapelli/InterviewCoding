

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;


public class ReverseWord {
  public static void main(String args[]) {
      
        String input = "hello infosys!";
        
        // Split input by space, reverse each word, and join them back
        String reversed = Arrays.stream(input.split(" "))
                // .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                //     Collections.reverse(list);  // Reverse the list
                //     return list.stream();       // Create a new stream from the reversed list  --> infosys hello
                // }))
                .map(word -> new StringBuilder(word).reverse().toString()) // Reverse each character in a word   --> olleh !sysofni
                .collect(Collectors.joining(" ")); // Join the reversed words back with space

        System.out.println(reversed);
  }
}
