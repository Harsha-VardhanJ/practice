import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base value:");
		int base = scan.nextInt();
		System.out.println("Enter exponent value:");
		int exponent = scan.nextInt();
		double result = calculatePower(base, exponent);
		System.out.println(result);
		scan.close();
	}

	public static double calculatePower(int base, int exponent) {
		int power = 1;
		for(int i=1; i<=exponent; i++) {
			power = base*power;
		}
		return power;
	}

}
