
public class Break {

	public static void main(String[] args) {
	outer:	for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println("i: " + i + ", j: " + j);
				if(j==2) {
					break outer;
				}
			}
		}
	}

}
