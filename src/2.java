import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        Random rand = new Random();

        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
