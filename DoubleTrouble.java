import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scan.nextInt();
		int d = doubleTheNumber(a);
		System.out.println("Double the number is " + d);
		
		scan.close();
		
	}

	public static int doubleTheNumber(int num) {
		return 2*num;
	}

}
