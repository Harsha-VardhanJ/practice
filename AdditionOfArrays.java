package practice;

import java.util.Scanner;

public class AdditionOfArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array Declaration and Creation
		System.out.println("Enter size of Array arr:");
		int arr[] = new int[scan.nextInt()];
		int brr[] = new int[arr.length];
		int crr[] = new int[arr.length];		
		//Array Initialization
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element "+(i+1)+" of array1");
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element "+(i+1)+" of array2");
			brr[i] = scan.nextInt();
		}
		
		arraySum(arr, brr, crr);
		System.out.println();
		//productOfArray(arr, brr, crr);
		
		scan.close();
	}
	
	//Method to find product of arrays
	public static void productOfArray(int[] arr, int[] brr, int[] crr) {
		System.out.println("Product of arrays");
		for(int i=0; i<arr.length; i++) {
			crr[i] = arr[i]*brr[i];
			System.out.print(crr[i]+" ");
		}
	}

	//Method to find Array sum;
	public static void arraySum(int[] arr, int[] brr, int[] crr) {
		System.out.println("Addition of arrays");
		for(int i=0; i<arr.length; i++) {
			crr[i] = arr[i] + brr[i];
			System.out.print(crr[i] + " ");
		}
	}

}
