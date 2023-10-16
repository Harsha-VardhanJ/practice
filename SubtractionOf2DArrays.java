package practice;

import java.util.Scanner;

public class SubtractionOf2DArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base size of Array :");
		int size1 = scan.nextInt();
		System.out.println("Enter size of sub array:");
		int size2 = scan.nextInt();
		
		//Array Declaration and Creation
		int[][] arr = new int[size1][size2];
		int[][] brr = new int[size1][size2];
		
		//Array Initialization
		for(int i=0; i<size1; i++) {
			System.out.println("Elements of subarray "+(i+1)+" of arr:");
			for(int j=0; j<size2; j++) {
				System.out.println("Enter element "+(j+1));
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<size1; i++) {
			System.out.println("Elements of subarray "+(i+1)+" of brr:");
			for(int j=0; j<size2; j++) {
				System.out.println("Enter element "+(j+1));
				brr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("-------->OUTPUT<--------");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("  -");
		for(int i=0; i<brr.length; i++) {
			for(int j=0; j<brr[0].length; j++) {
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
		
		subtractionOf2Darrays(arr, brr);
		scan.close();
	}
	
	public static void subtractionOf2Darrays(int[][] arr, int[][] brr) {
		int crr[][] = new int[arr.length][arr[0].length];
		System.out.println("  =");
		for(int i=0; i<crr.length; i++) {
			for(int j=0; j<crr[0].length; j++) {
				crr[i][j] = arr[i][j] - brr[i][j];
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
