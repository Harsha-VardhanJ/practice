package practice;

import java.util.Scanner;

public class MergeOneByOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int[] arr = new int[scan.nextInt()];
		int[] brr = new int[arr.length];
		int[] mergedArray = new int[arr.length+brr.length];
		System.out.println("Elements of arr:");
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element "+(i+1));
			arr[i] = scan.nextInt();
		}
		System.out.println("Elements of brr:");
		for(int i=0; i<brr.length; i++) {
			System.out.println("Enter element "+(i+1));
			brr[i] = scan.nextInt();
		}
		int a=0;
		int b=0;
		for(int i=0; i<mergedArray.length; i++) {
			if(i%2==0) {
				mergedArray[i] = arr[a];
				a++;
			}
			else {
				mergedArray[i] = brr[b];
				b++;
			}
			System.out.print(mergedArray[i]+" ");
		}
		
		scan.close();
	}

}
