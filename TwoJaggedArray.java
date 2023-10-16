package practice;

import java.util.Scanner;

public class TwoJaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array Declaration and Creation
		int[][] arr = new int[2][];
		arr[0] = new int[4];
		arr[1] = new int[2];
		
		//Array Initialization
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter element "+(j+1));
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println("*******************");
		
		//Array Traversing
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Element "+(j+1)+" = "+arr[i][j]);
			}
		}
		scan.close();
	
	}

}
