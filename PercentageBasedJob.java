import java.util.Scanner;

public class PercentageBasedJob {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = scan.nextInt();
		if(marks >= 90) {
			System.out.println("Join in Artificial Intelligence!");
		}
		else if(marks >= 75 && marks < 90) {
			System.out.println("Join in IoT");
		}
		else if(marks >= 60 && marks < 75) {
			System.out.println("Join in Neural Networks");
		}
		else if(marks >= 45 && marks < 60) {
			System.out.println("Join in Quantum Computing");
		}
		else
			System.out.println("Join in IT job");
		scan.close();
	}

}
