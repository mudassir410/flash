package javaGenerics;

public class SampleGenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleGenerics<Integer> integerObject = new SampleGenerics<Integer>(45); // LINE A
		integerObject.showType();
		int integerValue = integerObject.getObject();
		System.out.println("Given Integer Value is : " +integerValue);
		
		SampleGenerics<String> stringObject;
		stringObject = new SampleGenerics<String>("MeritCampus"); // LINE B
		stringObject.showType();
		String str = stringObject.getObject();
		System.out.println("Given String is : " +str);
		
		SampleGenerics<Double> DoubleObject = new SampleGenerics<Double>(10.25); // LINE A
		DoubleObject.showType();
		Double DoubleValue = DoubleObject.getObject();
		System.out.println("Given Double Value is : " +DoubleValue);
	}
}
