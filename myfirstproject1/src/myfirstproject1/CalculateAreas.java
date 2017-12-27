package myfirstproject1;

public class CalculateAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shapes[]=new Shape[3];
		shapes[0]=new Rectangle(30.3,45.4);
        shapes[1]=new Circle(23.2);
        shapes[2]=new Triangle(146.2,40.0);
        
        Shape smallest = shapes[0];

        for(int i =0; i < shapes.length; i++)
        {
            if(shapes[i].getArea()< smallest.getArea())
            {
                smallest = shapes[i];
            }
        }
        System.out.println("The details of the shape with smallest area are :");
        
        smallest.printDetails();    
    

        Rectangle rect =new Rectangle(30.3,45.4);
        System.out.println("Area of rectangle is "+ rect.getArea());
        System.out.println("Perimeter of rectangle is"+ rect.getperimeter());
        
        Circle circle =new Circle(23.2);
        System.out.println("Area of circle is "+ circle.getArea());   
        System.out.println("Perimeter of circle is "+ circle.getperimeter());
        Triangle Tri = new Triangle(146.2,40.0);
        System.out.println("Area of Triangle is "+ Tri.getArea());
        System.out.println("Perimeter of Triangle is "+ Tri.getperimeter());
    }
}

abstract class Shape
{
    abstract double getArea();// LINE A
	abstract double getperimeter();
	abstract void printDetails();
}
class Rectangle extends Shape
{
    double length;
    double breadth;

    Rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    double getArea()
    {
    	return length*breadth;
    }
    double getperimeter()
    {
        return (length * breadth)/2;
    }
    void printDetails()
    {
        System.out.println("Type = Rectangle");
        System.out.println("Length = "+ length);
        System.out.println("Breadth = "+ breadth);
        System.out.println("Area = "+ getArea());
    }
}

class Circle extends Shape
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }
    double getArea()
    {
    	return 3.14*radius*radius;
    }
    double getperimeter()
    {
        return 3.14* radius * 2;

	}
    void printDetails()
    {
        System.out.println("Type = Circle");
        System.out.println("Radius = "+ radius);
        System.out.println("Area = "+ getArea());
    }


}
class Triangle extends Shape
{
	double height;
	double base;
	Triangle(double height, double base)
	{
		this.height = height;
		this.base = base;
	}
	double getArea()
	{
		return (base*height)/2.0;
	}
	double getperimeter()
	{
		return base+height;
	}
	void printDetails()
    {
        System.out.println("Type = Triangle");
        System.out.println("Base = "+base);
        System.out.println("Height = "+ height);
        System.out.println("Area = "+ getArea());
    }

}
