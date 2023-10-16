package practice;

import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array:");
		
		//Array Declaration and Creation
		int[] arr = new int[scan.nextInt()];
		
		//Array Initialization
		System.out.println("Elements of array");
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element "+(i+1));
			arr[i] = scan.nextInt();
		}
		
		BubbleSortDemo bubble1 = new BubbleSortDemo();
		int[] brr = bubble1.behaviour(arr);
		System.out.println("Sorted array is");
		for(int i:brr) {
			System.out.print(i +" ");
		}
		
		scan.close();
	}

}
