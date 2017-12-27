package javaGenerics;
import java.util.ArrayList;
import java.util.List;

public class GenericsWithLowerBoundedWildCardsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object>list = new ArrayList<Object>();
		//addInteger(list);
		addDoubles(list);
		
		for(Object value:list)
		{
			System.out.println(value+"");
		}
	}
	//public static void addInteger(List<? super Integer>list)
	public static void addDoubles(List<? super Double>list)
	{
		for(int i=1; i<5; i++)
		{
			list.add((double) i);
		}
	}
}
