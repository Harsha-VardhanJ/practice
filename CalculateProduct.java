import java.util.Scanner;

public class CalculateProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of even terms:");
		int n = scan.nextInt();
		long result = calculateProduct(n);
		System.out.println(result);
		scan.close();
	}

	public static long calculateProduct(int n) {
		int i=1,product=1,count=0;
		do {
			if(i%2==0) {
			product = product*i;
			count++;
			}
			i++;
		}while(count<n);
		return product;
	}

}
