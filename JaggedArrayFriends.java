package practice;

import java.util.Scanner;

public class JaggedArrayFriends {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Array Declaration and Creation
		System.out.println("Enter number of batches:");
		String[][] arr = new String[scan.nextInt()][];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter number of friends in A"+(i+1)+" Batch:");
			arr[i] = new String[scan.nextInt()];
		}

		//Array Initialization
		for(int i=0; i<arr.length; i++) {
			System.out.println("A"+(i+1)+" Batch Friends");
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("Enter Friend "+(j+1)+" name: ");
				arr[i][j] = scan.next();
			}
		}
		System.out.println("*****************");
		//Array Traversing
		for(int i=0; i<arr.length; i++) {
			System.out.println("A"+(i+1)+" Batch Friends");
			System.out.println("I have "+arr[i].length+" friends");
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Friend "+(j+1)+": "+arr[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}

}
