import java.util.Scanner;
public class Arithmetic {

	public static int subtractNumbers(int num1,int num2) {	
		return num1-num2;
	}
	
	public static int multiplyNumbers(int num1,int num2) {
		return num1*num2;
	}
	
	public static double divideNumbers(int num1,int num2) {
		return num1/num2;
	}
	
	public static int findRemainder(int num1,int num2) {
		return num1%num2;
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c = scan.next().charAt(0);
		if(c == '-' || c == '*' || c == '/' || c == '%') {
		System.out.println("Enter two numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		switch(c) {
		
		case '-':
			int diff = subtractNumbers(a,b);
			System.out.println("Difference = " + diff);
			break;
		case '*':
			int pro = multiplyNumbers(a,b);
			System.out.println("Product = " + pro);
			break;
		case '/':
			double q = divideNumbers(a,b);
			System.out.println("Division = " + q);
			break;
		case '%':
			int rem = findRemainder(a,b);
			System.out.println("Remainder = " + rem);
			break;
		
		}
		scan.close();
		}
		else
			System.out.println("Invalid input...");
	}

}
