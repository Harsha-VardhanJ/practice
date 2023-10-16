import java.util.Scanner;

public class NarmstrongNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range value:");
		int n = scan.nextInt();
		printArmstrongNumbers(n);
		scan.close();
	}

	public static void printArmstrongNumbers(int n) {
		for(int i=1; i<=n; i++)
		{
			int temp = i;
			int r,sum = 0;
			
			for(; temp>0;) 
			{
				r = temp%10;
				r = r*r*r;
				sum = sum + r;
				temp = temp/10;
				
			}
			if(sum == i)
			{
				System.out.print(i + " ");
			}
		}
	}
}

