package practice;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scan.nextInt();
		System.out.println("Enter number of columns");
		int columns = scan.nextInt();
		
		int[][] arr = new int[rows][columns];
		int[][] brr = new int[rows][columns];
		
		for(int i=0; i<rows; i++) {
			System.out.println("Elements of subarray "+(i+1)+" of arr:");
			for(int j=0; j<columns; j++) {
				System.out.println("Enter element "+(j+1));
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++) {
			System.out.println("Elements of subarray "+(i+1)+" of brr:");
			for(int j=0; j<columns; j++) {
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
		System.out.println("  *");
		for(int i=0; i<brr.length; i++) {
			for(int j=0; j<brr[0].length; j++) {
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
		
		matrixMultiplication(arr, brr);
		scan.close();
	}
	
	public static void matrixMultiplication(int[][] arr, int[][] brr) {
		int crr[][] = new int[arr.length][arr[0].length];
		System.out.println("  =");
		for(int i=0; i<crr.length; i++) {
			for(int j=0; j<crr[i].length; j++) {
				crr[i][j] = 0;
				for(int k=0; k<crr[i].length; k++) {
					crr[i][j] = crr[i][j] + (arr[i][k]*brr[k][j]);
				}
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
