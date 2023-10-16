package practice;

public class Binary {
	
	public void binarySearch(int[] arr, int element) {
			int low = 0;
			int high = arr.length-1;
			int position = -1;
			boolean isElementFound = false;
			
			while(low<=high) {
				int mid = (low+high)/2;
				
				if(element == arr[mid]) {
					isElementFound = true;
					position = mid+1;
					break;
				}
				
				else if(element < arr[mid]) {
					high = mid-1;
				}
				
				else {
					low = mid+1;
				}
				
			}
			
			if(isElementFound == false) {
				System.out.println("Element " + element +" not found...");
			}
			
			else {
				System.out.println("Element "+ element +" found at "+ position);
			}
			
		}
}


