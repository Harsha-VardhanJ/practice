import java.util.Scanner;
public class StringJoiner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String fName = scan.next();
		System.out.println("Enter middle name: ");
		String mName = scan.next();
		System.out.println("Enter last name: ");
		String lName = scan.next();
		String fullName = joinStrings(fName, mName, lName);
		System.out.println("Full name is : " + fullName);
		
		scan.close();
	}

	
	public static String joinStrings(String firstName, String middleName, String lastName) {
		return firstName + " " + middleName + " " + lastName;

	}

}