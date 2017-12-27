package collections;

import java.util.*;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
		adq.add(1);
		adq.add(2);
		adq.add(3);
		adq.add(4);
		//adq.add(null);
		System.out.println(adq.pop());
		System.out.println(adq);
		System.out.print("Elements of queue: ");
		while(adq.peek()!=null)
		System.out.print(adq.pop()+"\t");
        System.out.println();
        System.out.print("Elements of stack: ");
        adq.push(1);
        adq.push(2);
        adq.push(3);
        adq.push(4);
        while(adq.peek()!=null)
        System.out.print(adq.pop()+"\t");
		
	}

}
