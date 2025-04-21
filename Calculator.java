// Defining the Calculator class
public class Calculator {

    // Method to add two integers, takes two parameters: a and b
    public int add(int a, int b) {
        // Returning the sum of a and b
        return a + b;
    }

    // The main method
    public static void main(String[] args) {
        
        // Creating an object of the Calculator class
        Calculator c = new Calculator();
        
        // Calling the add method on the Calculator object with 5 and 7 as arguments
        int result = c.add(5, 7);  // Passing arguments
        
        // Printing the result of the addition (the sum of 5 and 7)
        System.out.println("Sum: " + result);  // Output: Sum: 12
    }
}
