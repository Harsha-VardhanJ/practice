import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of natural numbers:");
		int n = scan.nextInt();
		int result = sumOfSquares(n);
		System.out.println("Sum of squares is " + result);
		scan.close();
	}

	public static int sumOfSquares(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + i*i;
		}
		return sum;
	}

}
