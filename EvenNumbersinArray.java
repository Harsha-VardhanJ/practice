package practice;

import java.util.Scanner;

public class EvenNumbersinArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array Declaration
		int[] arr;
		
		//Array Creation
		System.out.println("Enter size of array:");
		int size = scan.nextInt();
		arr = new int[size];
		
		//Array Initialization
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the element " + (i+1));
			arr[i] = scan.nextInt();
		}
		
		//Even numbers in array
		System.out.println("Even numbers in array");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i] + " ");
			}
		}
		scan.close();
	}

}