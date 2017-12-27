package stringBuffer;

public class StringBufferBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Merit Campus");
		sb.reverse();
		System.out.println(sb);
		sb.append(" online Java tutorial.");
		System.out.println(sb);
		sb.setCharAt(5,'*');
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer("C++,Html,C");
		sb1.replace(4, 8, "java");
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer("Merit");
		sb2.insert(2, 'a');
		System.out.println(sb2);
		
	}
}
