package stringBuffer;

public class StringBufferDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Merit Campus ");
        sb.insert(sb.length(), "Your Online Java School. ");
        CharSequence ch = "Don't Just Learn Java, Do Java";
        sb.insert(sb.length(), ch);
        //System.out.println(sb);
        sb.insert(sb.length(), " Do Java with ");
        sb.insert(sb.length(), 600);
        System.out.print(sb + "+ practise programs.");
        //System.out.println(sb);
	}

}
