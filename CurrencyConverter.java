import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter currency in INR: ");
		int iNR = scan.nextInt();
		currencyConverter(iNR);
		scan.close();
	}

	public static void currencyConverter(double iNR) {
		double dollar = iNR/82.72;
		double pound = iNR/105.43;
		System.out.println("The given amount in Dollars is " + dollar);
		System.out.println("The given amount in Pounds is " + pound);
		 
	}

}
