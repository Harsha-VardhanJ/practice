package practice;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {48,32,16,29,72,44,63};
		for(int i=0; i<arr.length-1; i++) {
			int min=arr[i], index=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<min) {
					min = arr[j];
					index = j;
				}
			}
			arr[index] = arr[i];
			arr[i] = min;
		}
		System.out.println("After sorting");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
