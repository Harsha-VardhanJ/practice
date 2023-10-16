import java.util.Scanner;
public class TechClub {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks = ");
		int marks = scan.nextInt();
		
		if(marks >= 90) {
			System.out.println("Welcome to Tech Club!");
		}
		scan.close();
	}

}