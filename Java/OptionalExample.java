/*
Optional:

The Optional class is used to avoid NullPointerException by explicitly dealing with values that may or may not be present.

Here, Optional.ofNullable(name) creates an optional object that handles the case where name might be null. 
The orElse method provides a default value when the Optional is empty.
*/

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = null;

        // Create an Optional object
        Optional<String> optionalName = Optional.ofNullable(name);

        // Use Optional to provide a default value if name is null
        String result = optionalName.orElse("Default Name");

        System.out.println(result); // Output: Default Name
    }
}
