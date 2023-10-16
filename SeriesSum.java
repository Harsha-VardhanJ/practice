import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		double s = seriesSum(num);
		System.out.println(s);
		scan.close();
	}

	static double seriesSum(int num) {
		double sum = 0.0;
		for(double i=1; i<=num; i++) {
			sum = sum + (1/i);
		}
		return sum;
	}

}
