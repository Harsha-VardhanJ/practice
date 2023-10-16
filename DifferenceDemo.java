import java.util.Scanner;
public class DifferenceDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a > b) {
			System.out.println("Difference is : " + (a-b));
		}
		else {
			System.out.println("Difference is : " + (b-a));
		}
		scan.close();
	}

}

