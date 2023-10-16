package practice;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array");
		
		//Array Declaration and Creation
		int[] arr = new int[scan.nextInt()];
		
		//Array Initialization
		System.out.println("Elements of array");
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element "+(i+1));
			arr[i] = scan.nextInt();
		}
		
		secondLargest(arr);
		scan.close();
	}

	public static void secondLargest(int[] arr) {
		int max1=-2147483648,max2=-2147483648;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max1) {
				max1 = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max2 && arr[i]<max1) {
				max2 = arr[i];
			}
		}
		
		System.out.println("Second largest is "+max2);
	}

}
