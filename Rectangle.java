package polymorphism2;

public class Rectangle extends Shape{
	
	double length=5.5, breadth=4.5;

	@Override
	public double calculateArea() {
		return length*breadth;
	}
	
	public double calculateRectPerimeter() {
		return 2*(length+breadth);
	}
	
	
}
