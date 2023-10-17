package polymorphism2;

public class Demo {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		Square s = new Square();
		Rectangle r = new Rectangle();
		Geometry g = new Geometry();
		
		g.doActivity(c);
		g.doActivity(s);
		g.doActivity(r);
	}

}
