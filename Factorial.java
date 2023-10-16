import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		scan.close();
		int fact = 1;
		for(; num>=1; num--) {
			fact = fact*num;
		}
		System.out.println("Factorial is " + fact);
	}
}
	


