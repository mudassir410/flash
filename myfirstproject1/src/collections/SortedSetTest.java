package collections;
import java.util.*;

public class SortedSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SortedSet<Integer> ss = new TreeSet<Integer>();
		ss.add(10);
		ss.add(30);
		ss.add(98);
		ss.add(80);
		ss.add(10);
		ss.add(99);
		ss.add(88);*/
		SortedSet<String> ss = new TreeSet<String>();
		ss.add("geeta");
		ss.add("seeta");
		ss.add("meeta");
		ss.add("neeta");
		ss.add("reeta");
		System.out.println("SortedSet elements : "+ ss);
		System.out.print("Iterating SortedSet elements : ");
		Iterator it = ss.iterator();
		while (it.hasNext()) 
		{
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("Lowest element :"+ ss.first());
        System.out.println("Highest element :"+ ss.last());
        System.out.println("Lesser than elements : " +ss.headSet("seeta"));
        System.out.println("Higher than or equals elements : "+ ss.tailSet("meeta"));
        System.out.println("Range elements : "+ss.subSet("neeta", "reeta"));
        
	}

}
