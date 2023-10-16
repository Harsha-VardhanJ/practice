package practice;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][];
		System.out.println("Enter values of array:");
		for(int i=0; i<arr.length; i++) {
			arr[i] =new int[i+2];
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
		
	}

}
