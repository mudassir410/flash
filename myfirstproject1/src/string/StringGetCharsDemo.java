package string;

public class StringGetCharsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "Merit Campus";
        char[] dest = new char[20];
        dest[5] = 'o';
        dest[6] = 'r';
        dest[7] = 'i';
        dest[8] = 'o';
        dest[9] = 'u';
        dest[10] = 's';
        try {
            System.out.println("dest array contents:" + String.valueOf(dest) );
            source.getChars( 0, 5, dest, 0 ); // LINE A
            System.out.println( dest );
        } catch ( Exception ex ) {
            System.out.println( "An exception occured!" );
        }    
	}

}
