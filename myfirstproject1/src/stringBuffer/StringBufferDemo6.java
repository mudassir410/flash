package stringBuffer;

public class StringBufferDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buff = new StringBuffer("Java Util Package");
        System.out.println("Stringbuffer = " + buff);
        // replace substring from index 5 to index 9
        buff.replace(5, 9, "Lang"); 
        //buff.replace(0, buff.length(), "Merit Campus");
        //buff.replace(4, 17, ".meritcampus.com");
        // prints the stringbuffer after replacing
        System.out.println("After replacing: " + buff);
	}

}
