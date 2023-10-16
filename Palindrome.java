import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		boolean result = isPalindrome(num);
		System.out.println(result);
		scan.close();
	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		int r,sum = 0;
		for(; num>0;) {
			r = num%10;
			sum = sum*10 + r;
			num = num/10;
		}
		if(sum==temp) {
			return true;
		}
		else {
			return false;
		}
	}

}
