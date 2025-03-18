public class MyCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter two numbers to add, subtract, multiply or divide: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    
    switch (args[0]) {
      case "add":
        System.out.println(num1 + num2);
        break;
      case "subtract":
        System.out.println(num1 - num2);
        break;
      case "multiply":
        System.out.println(num1 * num2);
        break;
      case "divide":
        if (num2 != 0) {
          System.out.println(num1 / num2);
        } else {
          System.out.println("Cannot divide by zero!");
        }
        break;
      default:
        System.out.println("Invalid operation");
    }
  }
}
