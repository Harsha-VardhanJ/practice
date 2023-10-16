import java.util.Scanner;

public class SumofFirstnNaturalNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number upto which sum needs to be printed:");
		int n = scan.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum is " + sum);
		scan.close();
	}

}
