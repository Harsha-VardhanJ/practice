import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = scan.nextInt();
		
		if(marks >= 90)
			System.out.println("A grade");
		else if(marks < 90 && marks >= 75)
			System.out.println("B grade");
		else if(marks < 75 && marks >= 50)
			System.out.println("C grade");
		else if(marks < 50 && marks >= 35)
			System.out.println("D grade");
		else
			System.out.println("One more attempt");
	
		scan.close();
	}

}
