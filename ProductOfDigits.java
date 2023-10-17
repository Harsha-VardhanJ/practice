import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		int product = productOfDigits(num);
		System.out.println(product);
		scan.close();
	}

	public static int productOfDigits(int num) {
		int r,mul=1;
		while(num>0) {
			r = num%10;
			mul = mul*r;
			num = num/10;
		}
		return mul;
	}

}
