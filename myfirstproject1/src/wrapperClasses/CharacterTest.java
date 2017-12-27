package wrapperClasses;

public class CharacterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Checks for letter : " + Character.isLetter('8'));
        System.out.println("Checks for digit : " + Character.isDigit('k'));
        System.out.println("Checks for white space : " + Character.isWhitespace('\t'));
        System.out.println("Checks for uppercase : " + Character.isUpperCase('d'));
        System.out.println("Checks for lowercase : " + Character.isLowerCase('C'));
        System.out.println("Converts to uppercase : " + Character.toUpperCase('z'));
        System.out.println("Converts to lowercase : " + Character.toLowerCase('Z'));
        System.out.println("Converts to string : " + Character.toString('A'));    
	}

}
