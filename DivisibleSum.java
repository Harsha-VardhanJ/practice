import java.util.Scanner;

public class DivisibleSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start range:");
		int start = scan.nextInt();
		System.out.println("Enter end range:");
		int end = scan.nextInt();
		System.out.println("Enter divisor value:");
		int divisor = scan.nextInt();
		int result = calculateDivisibleSum(start, end, divisor);
		System.out.println(result);
		scan.close();
	}

	public static int calculateDivisibleSum(int start, int end, int divisor) {
		int sum=0;
		int i = start;
		do {
			if(i%divisor == 0) {
				sum = sum+i;
			}
			i++;
		}while(i<=end);
		
		return sum;
	}

}
