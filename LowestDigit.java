import java.util.Scanner;

public class LowestDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		int result = smallestDigit(num);
		System.out.println(result);
		scan.close();
	}

	public static int smallestDigit(int num) {
		int r,min = 9;
		do {
			r = num%10;
			if(r<min) {
				min = r;
			}
			num = num/10;
		}while(num>0);
		return min;
	}

}
