import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit: ");
		double f = scan.nextDouble();
		double c = tempConvert(f);
		System.out.println("The temperature in celcius is " + c);
		scan.close();
	}

	public static double tempConvert(double f) {
		return (f-32)*5/9;
	}

}
