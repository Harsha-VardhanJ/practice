package polymorphism2;

public class Circle extends Shape {
	
	double radius = 6.5;

	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	
	public double calculateCirclePerimeter() {
		return 2*Math.PI*radius;
	}
	
	
}
