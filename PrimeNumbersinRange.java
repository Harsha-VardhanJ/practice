import java.util.Scanner;

public class PrimeNumbersinRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for range:");
		int range = scan.nextInt();
		
		for(int i=2; i<=range; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
			System.out.print(i + " ");
			}
			
		}
		scan.close();
	}

}
