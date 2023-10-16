
public class Pattern22 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				if(i-j <= 0 && i+j <=10) {
					System.out.print((char)(64+i));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=4; i>=1; i--) {
			for(int j=1; j<=9; j++) {
				if(i-j <= 0 && i+j <=10) {
					System.out.print((char)(64+i));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
