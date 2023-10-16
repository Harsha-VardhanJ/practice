package practice;

import java.util.Scanner;

public class FindaNumberInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array Declaration and Creation
		System.out.println("Enter the size of array:");
		int[] arr = new int[scan.nextInt()];
		
		//Array Initialization
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the element " + (i+1));
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter the number to look for:");
		int num = scan.nextInt();
		findaNumberinArray(arr, num);
		scan.close();
	}
	
	//Method to find element in array
	public static void findaNumberinArray(int[] arr,int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				System.out.println("Element found");
				break;
			}
			if(i==arr.length-1) {
				System.out.println("Element not found");
			}
		}
	}

}
