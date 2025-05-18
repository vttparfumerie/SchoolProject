public class SchoolProject {
    public static void main(String[] args) {
        // Example 1: Simple addition of two numbers
        int num1 = 5;
        int num2 = 3;
        System.out.println("The sum is: " + (num1 + num2));

        // Example 2: Example with a for loop to iterate over a range of numbers
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i : numbers) {
            System.out.println("The number at index " + i);
        }

        // Example 3: Using an if-else statement to check if a number is even or odd
        int num = 7;
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}
