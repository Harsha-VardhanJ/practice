import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scan.nextInt();
		printMultiplicationTable(n);
		scan.close();
	}

	public static void printMultiplicationTable(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+"*"+j+"="+i*j + " ");
			}
			System.out.println();
		}
	}

}
