package practice;

import java.util.Scanner;

public class IndexedElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = scan.nextInt();
		
		//Array declaration and Creation
		int[] arr = new int[size];
		
		//Array Initialization
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element " + (i+1));
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter index number:");
		int index = scan.nextInt();
		
		//Method to find element at given index
		int element = findElementAtIndex(arr, index);
		System.out.println("Element at given index is " + element);
		scan.close();
	}

	public static int findElementAtIndex(int[] arr, int index) {
		int element = 0;
		for(int i=0; i<arr.length; i++) {
			if(i==index) {
				element = arr[i];	
			}
		}
		return element;
		
	}

}
