package practice;

import java.util.Scanner;

public class DemoArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter values of array:");
		//System.out.println(arr[0]);
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
		scan.close();
	}

}
