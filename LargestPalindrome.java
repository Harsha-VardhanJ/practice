import java.util.Scanner;

public class LargestPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range value:");
		int n = scan.nextInt();
		int result = largestPalindrome(n);
		System.out.println(result);
		scan.close();
	}

	public static int largestPalindrome(int n) {
		int j=1,large = 0;
		while(j<=n) {
		int r,sum=0;
		int temp=j;
		while(temp>0) {
			r = temp%10;
			sum = sum*10 + r;
			temp = temp/10;
		}
		if(sum == j) {
			large = j;
		}
		j++;
		}
		return large;
	}

}
