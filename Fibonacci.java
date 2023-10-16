import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n = scan.nextInt();
		int firstNumber = 0, secondNumber = 1;
		int nextNumber;
		if(n == 1) {
			System.out.println(firstNumber);
		}
		else if(n == 2) {
			System.out.println(firstNumber + " " + secondNumber);
		}
		else {
			System.out.print(firstNumber + " " + secondNumber + " ");
			for(int i=3; i<=n; i++) {
				nextNumber = firstNumber + secondNumber;
				System.out.print(nextNumber + " ");
				firstNumber = secondNumber;
				secondNumber = nextNumber;
			}
		}
		scan.close();
	}

}
