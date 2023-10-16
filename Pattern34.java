
public class Pattern34 {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			int k=i;
			for(int j=1; j<=4; j++) {
				if(i+j >=5) {
					System.out.print(k);
					k--;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
