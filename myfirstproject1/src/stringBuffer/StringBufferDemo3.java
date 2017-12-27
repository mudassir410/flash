package stringBuffer;

public class StringBufferDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buff = new StringBuffer("Java Programming");
		//StringBuffer buff = new StringBuffer("Hello Javaworld");
		//StringBuffer buff = new StringBuffer("'M','e','r','i','t',' ','C','a','m','p','u','s'");
        System.out.println("Buffer = " + buff);
        // char array
        char[] array = new char[]{'M','e','r','i','t',' ','C','a','m','p','u','s'};
        // copy the chars from index 5 to index 12 into subarray of array
        // the offset into destination subarray is set to 5
        buff.getChars(5, 12, array, 5);
        //buff.getChars(5, 12, array, 12); //ArrayIndexOutOfBoundsException
        // print character array
        System.out.println(array);
	}

}
