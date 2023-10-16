package practice;

import java.util.Scanner;

public class MaxMinElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		
		//Array Declaration and Creation
		int[] arr = new int[scan.nextInt()];
		
		//Array Initialization
		System.out.println("Elements of array");
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element "+(i+1));
			arr[i] = scan.nextInt();
		}
		
		maxMinElement(arr);
		scan.close();
	}

	public static void maxMinElement(int[] arr) {
		int maxElement = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>maxElement) {
				maxElement = arr[i];
			}
		}
		System.out.println("Maximum element is "+maxElement);
		
		int minElement = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<minElement) {
				minElement = arr[i];
			}
		}
		System.out.println("Minimum element is "+minElement);
	}

}
