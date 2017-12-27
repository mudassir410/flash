package collections;

import java.util.*;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList characters = new LinkedList();
		characters.add('A');
		characters.add('C');
		characters.add('D');
		System.out.println("Original list: " + characters);
		characters.add(1,'B');
		System.out.println("After adding B: " + characters);
		List numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		//characters.addAll(numbers);
		characters.addAll(0, numbers);
		System.out.println("After adding numbers: " + characters);
		characters.addFirst("First");
		characters.addLast("Last");
		System.out.println("After adding First and Last: " + characters);
		//characters.removeFirst();
		//characters.removeLast();
		characters.pollFirst();
		characters.pollLast();
		System.out.println("After removing First and Last:" + characters);
		Object[] newCharacters = characters.toArray();
		//char[] newCharacters = characters.toArray();//The above line throws a compilation error since objects cannot be converted to primitive data type char
		System.out.println("Conveting LinkedList to Array of objects: ");
		for(Object newCharacter : newCharacters)
		{
			System.out.print(newCharacter + ", ");
		}
		
	}

}
