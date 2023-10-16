
public class Scope {
static int j=1;
	public static void main(String[] args) {
		int i=10;
		if(true) {
			System.out.println(i);
		}
		System.out.println(j);
	}

}
