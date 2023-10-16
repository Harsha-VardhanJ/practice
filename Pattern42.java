
public class Pattern42 {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=7; j++) {
				if(i+j>=5 && j-i<=3 && (i+j)%2==1) {
					if(i+j==5 || j-i==3) {
						System.out.print("1");
					}
					else {
						System.out.print(i-1);
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
