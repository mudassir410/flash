package collections;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> characters = new ArrayList<Character>();
		characters.add('A');
		characters.add('B');
		characters.add('C');
		characters.add('D');
		characters.add('2');
		List<Character> hashcharacters = new ArrayList<Character>(characters);
		System.out.println("Elements in hashcharacters: " + hashcharacters);
		System.out.print("retrieving in order: "); 
		//Iterator it = hashcharacters.iterator();
		for (int i = 0; i < hashcharacters.size(); i++)
        {
            System.out.print(characters.get(i) + " ");
        }
		hashcharacters.remove(2);
		System.out.println();
        System.out.print("Modified HashSet: " + hashcharacters); 
	}

}
