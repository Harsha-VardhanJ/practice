import java.util.Scanner;

public class CubeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = scan.nextInt();
		
		int cube = cubeOfNumber(a);
		System.out.println("Cube of given number is " + cube);
		scan.close();
	}

	static int cubeOfNumber(int a) {
		return a*a*a;
	}

}
