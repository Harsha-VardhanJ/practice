package polymorphism2;

public class Geometry {
	
	public void doActivity(Shape sh) {
		sh.draw();
		System.out.println("Area is "+sh.calculateArea());
		
		if(sh instanceof Circle) {
			System.out.println("Perimeter is "+((Circle)(sh)).calculateCirclePerimeter());
		}
		else if(sh instanceof Square){
			System.out.println("Perimeter is "+((Square)(sh)).calculateSquarePerimeter());
		}
		else {
			System.out.println("Perimeter is "+((Rectangle)(sh)).calculateRectPerimeter());
		}
	}
}
