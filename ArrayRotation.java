package practice;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int[] arr = new int[scan.nextInt()];
		
		System.out.println("Elements of arr:");
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element "+(i+1));
			arr[i] = scan.nextInt();
		}
		
		int temp = arr[arr.length-1];
		for(int i=arr.length-1; i>=1; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		scan.close();
	}

}
