import java.util.Scanner;
public class Operators {
	public static void takeInput() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
	}
	
	
	public static void add() {
		System.out.println("Sum = " + (a+b));
	}
		
	public static void sub() {
		System.out.println("Difference = " + (a-b));
	}
	
	public static void mul() {
		System.out.println("Product = " + (a*b));
	}

	public static void div() {
		System.out.println("Division = " + (a/b));
	}
	
	public static void main(String[] args) {
		System.out.println("Choose an operation(+,-,*,/)");
		System.out.println("+ ---> Addition");
		System.out.println("- ---> Subtraction");
		System.out.println("* ---> Multiplication");
		System.out.println("/ ---> Division");
		
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		
		
		if(ch == '+') {
			takeInput();
			add();
		}
		else if(ch == '-') {
			takeInput();
			sub();
		}
		else if(ch == '*') {
			takeInput();
			mul();
		}
		else if(ch == '/') {
			takeInput();
			div();
		}
		else
			System.out.println("Choose correct operation...");
	
	}
		
	
}