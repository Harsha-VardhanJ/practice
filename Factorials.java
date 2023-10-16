import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scan.nextInt();
		printFactorials(n);
		scan.close();
	}

	public static void printFactorials(int n) {
		for(int i=1; i<=n; i++) {
			int fact=1;
			for(int j=1; j<=i; j++) {
				fact = fact*j;
			}
			System.out.println("Factorial of " + i + " is " + fact);
		}
	}

}
