package practice;

import java.util.Scanner;

public class SumOf3Darrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base size of array: ");
		int size1 = scan.nextInt();
		System.out.println("Enter size of subarray: ");
		int size2 = scan.nextInt();
		System.out.println("Enter size of array in subarray: ");
		int size3 = scan.nextInt();
		
		//Array Declaration and Creation
		int[][][] arr = new int[size1][size2][size3];
		int[][][] brr = new int[size1][size2][size3];
		
		//Array Initialization
		System.out.println("Elements of arr");
		for(int i=0; i<size1; i++) {
			System.out.println("Elements of subarray "+(i+1));
			for(int j=0; j<size2; j++) {
				System.out.println("Elements of array in subarray "+(j+1));
				for(int k=0; k<size3; k++) {
					System.out.println("Enter element "+(k+1));
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		System.out.println("Elements of brr");
		for(int i=0; i<size1; i++) {
			System.out.println("Elements of subarray "+(i+1));
			for(int j=0; j<size2; j++) {
				System.out.println("Elements of array in subarray "+(i+1));
				for(int k=0; k<size3; k++) {
					System.out.println("Enter element "+(k+1));
					brr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		sumOf3Darrays(arr, brr);
		scan.close();
	}

	//Method for sum of 3d Arrays
	public static void sumOf3Darrays(int[][][] arr, int[][][] brr) {
		int crr[][][] = new int[arr.length][arr[0].length][arr[0][0].length];
		System.out.print("{");
		for(int i=0; i<crr.length; i++) {
			System.out.print("{");
			for(int j=0; j<crr[0].length; j++) {
				System.out.print("{");
				for(int k=0; k<crr[0][0].length; k++) {
					crr[i][j][k] = arr[i][j][k] + brr[i][j][k];
					System.out.print(crr[i][j][k]+" ");
				}
				System.out.print("} ");
			}
			System.out.print("} ");
		}
		System.out.print("} ");
	}

}
