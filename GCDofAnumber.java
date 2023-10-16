import java.util.Scanner;

public class GCDofAnumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int gcd = findGCD(num1, num2);
		System.out.println("GCD is " + gcd);
		scan.close();
		
	}

	static int findGCD(int num1, int num2) {
		int a = 1;
		for(int i=1; i<=num1 && i<=num2; i++) {
			if(num1%i==0 && num2%i==0) {
				a = i;
			}
		}
		return a;
		
	}

}

