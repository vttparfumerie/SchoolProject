import java.util.Random;

public class RandomNumber {
  public static void main(String[] args) {
    int lowerBound = 1;
    int upperBound = 10;
    Random rand = new Random();
    int randomNum = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
    System.out.println("Random number between " + lowerBound + " and " + upperBound + ": " + randomNum);
  }
}
