package practice;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array Declaration and Creation
		System.out.println("Enter number of students:");
		int size1 = scan.nextInt();
		System.out.println("Enter number of subjects:");
		int size2 = scan.nextInt();
		int[][] arr = new int[size1][size2];
		
		//Array Initialization
		for(int i=0; i<size1; i++) {
			System.out.println("Student "+(i+1)+" data");
			for(int j=0; j<size2; j++) {
				System.out.print("Subject "+(j+1)+" marks = ");
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println("***************************************");
		
		//Array Traversing
		for(int i=0; i<size1; i++) {
			System.out.println("Student "+(i+1)+" data");
			for(int j=0; j<size2; j++) {
				System.out.println("Subject "+(j+1)+" marks = "+arr[i][j]);
			}
		}
		scan.close();
	}

}
