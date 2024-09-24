/*
Lambda Expression:
“this piece of code”, or “this function assigned to a variable”, is a Lambda expression.

Functional Interface:
interface that has only one function to be implemented is called a “functional interface”.
*/

public class LambdaExpression {
    public static void main(String[] args) {
        
       // Defining a functional interface with a single abstract method
        @FunctionalInterface
        interface LambdaInterface {
            // Abstract method that takes a String as an argument
            void doSomething(String str);
        }
        
        // Declaring a String variable and assigning it the value "Satheesh"
        String name = "Satheesh";
        
        // Creating an instance of LambdaInterface using a lambda expression
        // This lambda expression prints the passed String to the console
        LambdaInterface codeblock = (str) -> System.out.println(str);
        
        // This line executes the lambda expression, passing "name" as the argument
        codeblock.doSomething(name);
    }
}
