package practice;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5,4,10,1,6,2};
		
		for(int i=0; i<arr.length-1; i++) {
			int temp = arr[i+1];
			int j=i;
			while(j>=0 && arr[j]>temp) {
					arr[j+1] = arr[j];
					j--;
				}
			
			arr[j+1] = temp;

		}
		
		for(int i:arr) {
			System.out.print(i + " ");
		}
	}

}
