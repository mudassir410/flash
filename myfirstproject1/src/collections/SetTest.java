package collections;

import java.util.*;;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(30);
        s.add(98);
        s.add(80);
        s.add(99);
        s.add(80);
        s.add(30);
        s.add(50);*/
        Set<String> s = new HashSet<String>();
        s.add("Seeta");
        s.add("Geeta");
        s.add("Reeta");
        s.add("Meena");
        s.add("Geeta");
        s.add("Reeta");

        System.out.println("Set elements : "+ s);
        System.out.println("Iterating set elements :");
        Iterator it = s.iterator();
        while(it.hasNext())
        {
        	System.out.print(it.next() + " ");
        }
		System.out.println();
		System.out.println("Size of Set is : " + s.size());
        System.out.println("Set contains element : " + s.contains(30));
        System.out.println("Set is empty : " + s.isEmpty()); 
	}

}
