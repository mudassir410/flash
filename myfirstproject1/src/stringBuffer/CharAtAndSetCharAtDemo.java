package stringBuffer;

public class CharAtAndSetCharAtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("'Happy New Year!'");
		//StringBuffer sb = new StringBuffer("merit Campus");
		//sb.setCharAt(0, 'M');
		//System.out.println(sb);
        for (int i = 0; i < sb.length(); i++)
        {
            System.out.print(sb.charAt(i));
        }
        System.out.println();
        sb.setCharAt(sb.length() - 1, '"');
        sb.setCharAt(0, '"'); 
        //sb.setCharAt(-2, 'A');  // java.lang.StringIndexOutOfBoundsException
        System.out.println(sb); 
	}

}
