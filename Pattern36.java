
public class Pattern36 {

	public static void main(String[] args) {
		int k;
		for(int i=1; i<=7; i++) {
				if(i<=4) {
					k=i;;
				}
				else {
					k=8-i;
				}
				for(int j=1; j<=7; j++) {
					if(j>=5-k && j<=k+3) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
		}	

	}
}