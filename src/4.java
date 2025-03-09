
import java.util.*;
public class RandomJavaCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		sc.close();

		// Print Fibonacci series up to the user's input number
		int[] fibSeries = new int[n+1];
		fibSeries[0] = 0;
		fibSeries[1] = 1;
		for (int i=2; i<=n; i++) {
			fibSeries[i] = fibSeries[i-1] + fibSeries[i-2];
		}
		for (int i=0; i<=n; i++) {
			System.out.print(fibSeries[i]+" ");
		}
	}
}