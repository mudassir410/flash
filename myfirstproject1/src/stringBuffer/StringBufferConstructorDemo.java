package stringBuffer;

public class StringBufferConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer();
        System.out.println("Empty StringBuffer : " + sb1);
        CharSequence cs = "ABC";
        CharSequence sequence = "ABC";
        System.out.println(cs.equals(sequence));
        StringBuffer sb2 = new StringBuffer(cs);
        System.out.println(cs.equals(sb2));
        System.out.println("StringBuffer using CharSequence : " + sb2);
        String s = "XYZ";
        StringBuffer sb3 = new StringBuffer(s);
        System.out.println("StringBuffer using String : " + sb3);
	}

}
