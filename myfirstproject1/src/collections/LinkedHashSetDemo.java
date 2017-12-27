package collections;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Anderson");
        lhs.add("Bharath");
        lhs.add("Cruse");
        lhs.add("Dinesh");
        System.out.println("Elements retrieved in the order they were inserted : ");
        System.out.println(lhs);
        lhs.remove("Bharath");
        lhs.add("Bhuwaneshwar");
        System.out.println("Set after removing Bharath and adding Bhuwaneshwar : ");
        System.out.println(lhs);
        Object[] names = lhs.toArray();
        System.out.println("Displaying elements in array format : ");
        for (Object name : names)
        {
            System.out.print(name + ", ");
        }
        System.out.println();
        lhs.clear();
        System.out.println("Displaying empty set : ");
        System.out.println(lhs);
        lhs.contains("Bharath");
        System.out.println("finding Bharath"+lhs);

	LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
	lhs1.add(1);
	lhs1.add(2);
	lhs1.add(3);
	lhs1.add(4);
	lhs1.add(5);
    System.out.println("Elements retrieved in the order they were inserted : ");
    System.out.println(lhs1);
    lhs1.clone();
    System.out.println("Elements After Clone Method : ");
    System.out.println(lhs1);
}
	}
