package string;

public class StringConversiontoStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
        float b = 20.5f;
        char c = 'd';
        double d = 19.5;
        System.out.println(a + b + c + d);
        
        String s1 = Integer.toString(a);
        String s2 = Float.toString(b);
        String s3 = Character.toString(c);
        String s4 = Double.toString(d);
        System.out.println(s1 + " " + s2+ " " + s3 + " " + s4);
        
        double cake = 245.75;
        String rate = Double.toString(cake);
        String[] r = rate.split("\\.");
        String r1 = r[0];
        String r2 = r[1];
        System.out.println("The Price of cake is " + r1 + " Rupees " + r2 + " Paise."); 
	}

}
