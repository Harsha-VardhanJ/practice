package practice;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Array Declaration and Creation
		System.out.println("Enter size of array");
		int[] arr = new int[scan.nextInt()];
		
		//Array Initialization
		System.out.println("Elements of array");
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element "+(i+1));
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter element which is to be searched:");
		int element = scan.nextInt();
		
		Binary bSearch = new Binary();
		bSearch.binarySearch(arr, element);
		scan.close();
	}

}
