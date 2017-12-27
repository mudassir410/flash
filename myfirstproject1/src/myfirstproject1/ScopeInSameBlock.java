package myfirstproject1;

public class ScopeInSameBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 15;    // LINE A
        int y = x;    // LINE B
        int z = y + 20;    // LINE C
        
        System.out.println("x = " + x);    // LINE D
        System.out.println("y = " + y);    // LINE E
        System.out.println("z = " + z);    // LINE F
	}

}
