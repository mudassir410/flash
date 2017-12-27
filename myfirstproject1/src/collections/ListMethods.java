package collections;
import java.util.*;

public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(200);
		marks.add(210);
		marks.add(226);
		for(Integer x : marks)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		marks.add(1,30);
		for(Integer x : marks)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println(marks.get(2));
		System.out.println(marks.indexOf(226));
		System.out.println(marks.remove(2));
		for(Integer x : marks)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println(marks.set(0, 5));
		marks.add(3, null);
		for(Integer x : marks)
		{
			System.out.print(x + " ");
		}
	}

}
