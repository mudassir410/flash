package stringBuffer;

public class StringBufferDeleteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer firstWord = new StringBuffer("Bharat");
        System.out.println(firstWord);
        firstWord.delete(1, 4);
        System.out.println(firstWord);
        firstWord.deleteCharAt(0);
        System.out.println(firstWord);
        firstWord.delete(1, 4);
        System.out.println(firstWord);
	}

}
