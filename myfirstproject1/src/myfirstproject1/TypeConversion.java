package myfirstproject1;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 byte b = 50;
	        short s = 4125;
	        int i = 800000;
	        long l = 107343L;
	        
	        l = i;    // LINE C
	        i = s;    // LINE B
	        s = b;    // LINE A
	        
	        float f = 25.0f;
	        double d = 327.98;
	        
	        f = i;
	        d = f;
	        
	        System.out.println("b = " + b );    
	        System.out.println("s = " + s );    
	        System.out.println("i = " + i );    
	        System.out.println("l = " + l );    
	        System.out.println("d = " + d );    
	        System.out.println("f = " + f ); 
	}

}
