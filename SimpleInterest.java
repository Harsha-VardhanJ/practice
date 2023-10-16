import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Principal amount: ");
		int principal = scan.nextInt();
		System.out.print("Enter the Rate of interest: ");
		int rate = scan.nextInt();
		System.out.print("Enter the Time period: ");
		int time = scan.nextInt();
		System.out.println("Simple Interest is " + simpleInterest(principal, rate, time));
		scan.close();
	}

	public static double simpleInterest(int principal, int rate, int time) {
		return (principal*time*rate)/100;
	}

}
