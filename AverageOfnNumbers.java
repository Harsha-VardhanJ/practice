import java.util.Scanner;

public class AverageOfnNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n = scan.nextInt();
		double result = calculateAverage(n);
		System.out.println(result);
		scan.close();
	}

	public static double calculateAverage(int n) {
		int i = 1,sum = 0;
		do {
			sum = sum + i;
			i++;
		}while(i<=n);
		double avg = sum/n;
		return avg;
	}

}
