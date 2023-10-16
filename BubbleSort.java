package practice;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Array Declaration and Creation
		System.out.println("Enter size of array:");
		int[] arr = new int[scan.nextInt()];
		
		//Array Initialization
		System.out.println("Elements of array");
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element "+(i+1));
			arr[i] = scan.nextInt();
		}
		
		//Array Traversal
		System.out.println("Before sorting");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
		//Bubble Sort
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				int temp=0;
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
