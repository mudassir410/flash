package string;

public class StringGetBytesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String input = new String("Merit Campus");
		String input = new String("Merit Campus ‰");
        try {
            byte[] bytes = input.getBytes();
            System.out.print("After encoding : ");
            for (byte b : bytes)
                System.out.print(b + " ");
            	System.out.println();
            	System.out.print("After encoding : ");
            	//bytes = input.getBytes("UTF-8"); 
            	//bytes = input.getBytes("UTF-16"); 
            	bytes = input.getBytes("UTF-32"); 
            for (byte b : bytes)
                System.out.print(b + " ");
            	System.out.println();
            	System.out.print("After encoding : ");
            	bytes = input.getBytes("ISO-8859-1");
            	bytes = input.getBytes("ISO-8859-5");
            for (byte b : bytes)
                System.out.print(b + " ");
        } catch (Exception e) {
            System.out.println("Unsupported character set");
        }
	}

}
