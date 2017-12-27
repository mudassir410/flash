package wrapperClasses;

public class NumberstoStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 32;
        String s1 = "" + i;
        System.out.println("s1 = " + s1);
        long l = 876;
        String s2 = String.valueOf(l);
        System.out.println("s2 = " + s2);
        int i1 = 156;
        double d = 156.123;
        //String s3 = Integer.toString(i1);
        String s3 = Double.toString(d);
        System.out.println("s3 = " + s3);
        String s4 = "" + i + l;
        System.out.println("s4 = " + s4);
        int n = s4.indexOf('.');
        System.out.println(n + " Digits before decimal point of s4 string.");
        System.out.println(s4.length() - n - 1 + " Digits after decimal point of s4 string.");
	}

}
