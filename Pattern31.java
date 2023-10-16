
public class Pattern31 {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			for(int j=1; j <= 2*i-1; j++) {
				if(j==3) {
					System.out.print("1");
				}
				else if(j%2 == 0) {
					System.out.print("2");
				}
				else if(j%2!=0 && j!=3) {
					System.out.print("3");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
