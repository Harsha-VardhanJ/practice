import java.util.Scanner;

public class LengthOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		long num = scan.nextLong();
		int result = lengthOfNumber(num);
		System.out.println("Number of digits is " + result);
		scan.close();
	}

	public static int lengthOfNumber(long num) {
		int r,count=0;
		while(num>0) {
			r = (int)num%10;
			count++;
			num = num/10;
		}
		return count;
	}

}
