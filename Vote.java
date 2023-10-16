import java.util.Scanner;
public class Vote {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age = scan.nextInt();
		
		if(age >= 18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You're not eligible to vote");
		}
		scan.close();
	}

}
