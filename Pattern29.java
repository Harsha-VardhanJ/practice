
public class Pattern29 {

	public static void main(String[] args) {
		int num=5;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				if(i==j) {
					System.out.print(num);
				}
				else if(i-j == 1) {
					System.out.print(num-1);
				}
				else if(i-j == 2) {
					System.out.print(num-2);
				}
				else if(i-j == 3) {
					System.out.print(num-3);
				}
				else if(i-j == 4) {
					System.out.print(num-4);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
