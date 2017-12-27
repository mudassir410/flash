package javaGenerics;
import java.util.ArrayList;
import java.util.List;
public class GenericsWithWildCardsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            List<Integer> integerList = new ArrayList<Integer>();
            integerList.add(6); 
            integerList.add(3); 
            integerList.add(10);
            print(integerList);
            System.out.println("\n----------");
            List<String> stringList = new ArrayList<String>();
            stringList.add("A");
            stringList.add("B");
            stringList.add("C");
            print(stringList);
        }
        public static void print(List<?> list)
        {
            for(Object input : list)
            	{
                	System.out.print(input +" ");
            	}
	}
}
