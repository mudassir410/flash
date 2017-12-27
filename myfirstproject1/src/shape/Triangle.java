package shape;

public class Triangle 
{
	double base;
	double height;
	
	Triangle(double base, double height)
	 {
	 this.base = base;
	 this.height = height;
	 }
	
	double getArea()
	 {
	 return base * height / 2.0;
	 }
}
