import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = scan.next().charAt(0);
		
		if(ch == 'a' || ch == 'A')
			System.out.println("Vowel");
		else if(ch == 'e' || ch == 'E')
			System.out.println("Vowel");
		else if(ch == 'i' || ch == 'I')
			System.out.println("Vowel");
		else if(ch == 'o' || ch == 'O')
			System.out.println("Vowel");
		else if(ch == 'u' || ch == 'U')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
			
		scan.close();	
	}

}
