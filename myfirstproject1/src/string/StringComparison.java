package string;
import java.lang.*;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Merit");
        String s2 = new String("Merit");
        Integer firstReference = new Integer(10);
        Integer secondReference = firstReference;
        System.out.println(firstReference == secondReference);
        String first = "Merit Campus";
        String second = null;
        System.out.println(first.equals(second));
        //String first = "Merit Campus";
        //String second = null;
        //System.out.println(second.equals(first));
        if(s1 == s2)  
        {
            System.out.println("Equal");
        }
        else 
        {
            System.out.println("Not Equal");
        }
        if(s1.equals(s2))
        {
            System.out.println("Equal");
        }
        else 
        {
            System.out.println("Not Equal");
        }
	}

}
