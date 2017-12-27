package javaGenerics;

public class GenericClassWithThreeParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ThreeGenerics<Integer, String,Double> obj = new ThreeGenerics<Integer, String,Double>(45, "Meritcampus",10.25);
		obj.showTypes();
		int integerValue = obj.getOb1();
		System.out.println("The given Integer is : " + integerValue);
		String str = obj.getOb2();
		System.out.println("The given String is : " + str);
		Double dbl = obj.getOb3();
		System.out.println("The given Double is : " + dbl);
		}
		}

class ThreeGenerics<T, V, Z>
		{
			T ob1;
			V ob2;
			Z ob3;
		ThreeGenerics(T ob1, V ob2, Z ob3)
		{
			this.ob1 =ob1;
			this.ob2 =ob2;
			this.ob3 =ob3;
		}
		T getOb1()
		{
			return ob1;
		}
		V getOb2()
			{
			return ob2;
			}
		Z getOb3()
			{
			return ob3;
			}
		void showTypes()
		{
		System.out.println("Type of T is : " + ob1.getClass().getName());
		System.out.println("Type of V is : " + ob2.getClass().getName());
		System.out.println("Type of Z is : " + ob3.getClass().getName());
		}
	}

