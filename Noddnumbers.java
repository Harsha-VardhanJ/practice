import java.util.Scanner;

public class Noddnumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of odd numbers:");
		int n = scan.nextInt();
		int result = sumOfOddnumbers(n);
		System.out.println("Sum of " + n + " odd numbers is " + result);
		scan.close();
	}

	public static int sumOfOddnumbers(int n) {
		int i = 1;
		int count = 0;
		int sum = 0;
		while(count<n) {
			sum = sum + i;
			count++;
			i += 2;
		}
		return sum;
	}

}
