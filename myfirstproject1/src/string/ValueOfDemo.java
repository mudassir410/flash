package string;

public class ValueOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
        boolean b = true;
        float f = 4.56789f;
        char c = 'a';
        double d = 25.5;
        long l = 123456L;
        Object obj = new Object();
        char[] data = {'M','E','R','I','T',' ','C','A','M','P','U','S'};
        String sample = String.valueOf(i);
        System.out.println("String of integer i : " + sample);
        sample = String.valueOf(b);
        System.out.println("String of boolean b : " + sample);
        sample = String.valueOf(f);
        System.out.println("String of float f : " + sample);
        sample = String.valueOf(data, 0, 12);
        System.out.println("String representation of data : "+ sample);
        sample = String.valueOf(data, 0, 5);
        System.out.println("Subarray in data starting at index 0 : " + sample);
        sample = String.valueOf(data, 6, 6);
        System.out.println("Subarray in data starting at index 6 : " + sample);
        sample = String.valueOf(c);
        System.out.println("String of character c : " + sample);
        sample = String.valueOf(d);
        System.out.println("String of double d : " + sample);
        sample = String.valueOf(l);
        System.out.println("String of long l : " + sample);
        sample = String.valueOf(obj);
        System.out.println("String of object obj : " + sample);
        sample = String.valueOf(null);
        sample = String.valueOf( (Object)null);
	}
}
