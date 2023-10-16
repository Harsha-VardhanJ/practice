import java.util.Scanner;

public class OddProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of odd terms:");
		int n = scan.nextInt();
		int result = calculateOddProduct(n);
		System.out.println(result);
		scan.close();
	}

	public static int calculateOddProduct(int n) {
		int i = 1,product = 1,count = 0;
		do {
			if(i%2==1) {
				product = product * i;
				count++;
			}
			i++;
		}while(count<n);
		return product;
	}

}
