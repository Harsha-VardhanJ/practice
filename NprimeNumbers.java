import java.util.Scanner;

public class NprimeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many prime numbers need to be printed?");
		int n = scan.nextInt();
		printPrimes(n);
		scan.close();
	}

	public static void printPrimes(int n) {
		int c = 1;
		for(int i=2; c<=n; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(i + " ");
				c++;
			}
		}
		
	}

}
