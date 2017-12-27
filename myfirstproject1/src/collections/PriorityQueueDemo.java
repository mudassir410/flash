package collections;

import java.util.*;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PriorityQueue<Integer> num = new PriorityQueue<Integer>();
		PriorityQueue<Integer> num = new PriorityQueue<>(1, new Comparator<Integer>()
		{
		    public int compare(Integer i, Integer j)
		    {
		        return j - i;
		    }
		});

		num.offer(1);
		num.offer(5);
		num.offer(2);
		//num.offer(null); //NullPointerException
		for (int i = 0; i < 3; i++)
        {
            System.out.println(num.peek());
            num.remove();
        }
		
	}

}
