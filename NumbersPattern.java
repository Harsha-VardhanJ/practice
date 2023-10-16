import java.util.Scanner;

public class NumbersPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scan.nextInt();
		printHourGlass(n);
		scan.close();
	}

	public static void printHourGlass(int n) {
		for(int i=1; i<= 2*n-1; i++) {
			for(int j=1; j<=2*n-1; j++) {
				System.out.print(n+" ");
				n--;
			}
			System.out.println();
		}
	}

}
