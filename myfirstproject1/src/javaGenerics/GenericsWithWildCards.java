package javaGenerics;
import java.util.ArrayList;
import java.util.List;

public class GenericsWithWildCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(3); 
        integerList.add(5); 
        integerList.add(10);
        print(integerList);
        
        List<String> stringList = new ArrayList<String>();
        stringList.add("A"); 
        stringList.add("B"); 
        stringList.add("C");        
    }
    public static void print(List<? extends Number> list)
    {
        for(Number input : list)
        {
            System.out.print(input +" ");
        }
	}
}
