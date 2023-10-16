
public class Pattern40 {

	public static void main(String[] args) {
		int k;
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				k=i;
			}
			else {
				k=10-i;
			}
			for(int j=1; j<=9; j++) {
				if(j<=k || j>=10-k) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
