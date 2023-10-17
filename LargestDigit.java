import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		int result = largestDigit(num);
		System.out.println("Largest digit is " + result);
		scan.close();
	}

	public static int largestDigit(int num) {
		int r,max = -1;
		while(num>0) {
			r = num%10;
			if(r>max) {
				max = r;
			}
			num = num/10;
		}
		return max;
	}

}
