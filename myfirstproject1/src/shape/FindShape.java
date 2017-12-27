package shape;

public class FindShape {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Rectangle rect = new Rectangle (10.25,5.5);
		System.out.println("Area of Rectangle "+rect.getArea());
		
		Circle cir = new Circle (50.5);
		System.out.println("Area of Circle "+cir.getArea());
		
		Triangle tri = new Triangle (20,15.5);
		System.out.println("Area of Triangle "+tri.getArea());
	}

}
