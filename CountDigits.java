import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		int result = countDigits(num);
		System.out.println(result);
		scan.close();
	}

	public static int countDigits(int num) {
		int r,count = 0;
		do {
			r = num%10;
			count++;
			num = num/10;
		}while(num>0);
		return count;
	}

}
