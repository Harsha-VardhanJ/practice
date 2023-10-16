import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		printTable(num);
		scan.close();
	}
	
	static void printTable(int num) {
		for(int i=1; i<=10; i++) {
			System.out.print(num*i + " ");
		}
	}
}
