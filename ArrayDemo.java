package practice;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array Declaration
		int[] arr;
		
		//Array Creation
		System.out.println("Enter size of array:");
		arr = new int[scan.nextInt()];
		
		//Array Initialization
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the element " + (i+1) + ": ");
			arr[i] = scan.nextInt();
		}
		
		//Array Forward Traversing
		System.out.println("Forward traversing");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//Array Backward Traversing
		System.out.println("Backward traversing");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		scan.close();
	}

}
