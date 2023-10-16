
public class Pattern30 {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=7; j++) {
				if(i+j >= 6 && j-i <= 2) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
