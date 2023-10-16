import java.util.Scanner;

public class SquareNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scan.nextInt();
		int sqNum = squareNumber(a);
		System.out.println("Square of given number is " + sqNum);
		scan.close();
	}

	static int squareNumber(int num) {
		return num*num ;
	}
	
}
