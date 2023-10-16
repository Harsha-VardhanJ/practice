import java.util.Scanner;

public class SecretMessageDecoder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = scan.next().charAt(0);
		System.out.println("The decoded message is " + decodeCharacter(ch));
		scan.close();
	
	}

	static int decodeCharacter(char ch) {
		int i = ch;
		return i;
	}

}
