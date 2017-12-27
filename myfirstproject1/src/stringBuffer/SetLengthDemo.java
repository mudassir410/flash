package stringBuffer;

public class SetLengthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Java Programming");
        System.out.println(sb + "\nLength = " + sb.length());
        sb.setLength(18);
        System.out.println(sb + "\nLength = " + sb.length());
        sb.setCharAt(16, '.');
        sb.setCharAt(17, '.');
        System.out.println(sb + "\nLength = " + sb.length());
        sb.setLength(4);
        System.out.println(sb + "\nLength = " + sb.length());
        //sb.setLength(-10);
        //System.out.println(sb + "\nLength = " + sb.length());
	}

}
