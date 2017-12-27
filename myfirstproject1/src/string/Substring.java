package string;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome to Merit Campus";
        String s2 = s1.substring(11);
        //String s2 = s1.substring(24);
        //String s2 = s1.substring(11, 10); //IndexOutOfBoundsException 
        System.out.println(s2);
        String s3 = s1.substring(11, 17);
        System.out.println(s3);
	}

}
