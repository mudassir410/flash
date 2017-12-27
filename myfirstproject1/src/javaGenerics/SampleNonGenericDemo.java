package javaGenerics;

public class SampleNonGenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleNonGeneric integerObject = new SampleNonGeneric(12);
		integerObject.displayType();
		Integer integerValue = (Integer)integerObject.getObj(); // LINE A
		System.out.println("The integer value is : "+integerValue);
		
		SampleNonGeneric stringObject;
		stringObject = new SampleNonGeneric("MeritCampus");
		stringObject.displayType();
		String string = (String)stringObject.getObj(); // LINE B
		System.out.println("The given string is :"+string);
		
		integerObject = stringObject; // LINE C
		integerValue = (Integer)integerObject.getObj(); // LINE D
	}
}
class SampleNonGeneric
	{
	Object obj;
	public SampleNonGeneric(Object obj)
	{
		this.obj = obj;
	}
	Object getObj()
	{
		return obj;
	}
	void displayType()
	{
		System.out.println("The type of object is : "+obj.getClass().getName());
	}
}