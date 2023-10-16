package practice;

import java.util.Scanner;

public class SumOfArray {

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
		
		//Sum of values in array
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of elements in the array is " + sum);
		scan.close();
		
		
	}

}
