import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter operator (+, -, *, /):");
        String operator = scanner.next();
        
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        
        switch(operator) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            
            case "/":
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (double)(num1 / num2));
                } else {
                    System.out.println("Divison by zero is not allowed!");
                }
        }

        scanner.close();
    }
}
