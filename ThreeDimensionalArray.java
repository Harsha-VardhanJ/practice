package practice;

import java.util.Scanner;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Array Declaration
		int[][][] arr;
		
		//Array Creation
		System.out.println("Enter base size of array:");
		int size = scan.nextInt();
		arr = new int[size][size][size];
		
		//Array Initialization
		System.out.println("Enter the elements of array");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				for(int k=0; k<size; k++) {
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		//Array Traversal
		System.out.println("Elements of array are");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				for(int k=0; k<size; k++) {
					System.out.print(arr[i][j][k]+" ");
				}
			}
		}
		
		scan.close();
	}

}
