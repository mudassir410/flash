package string;

public class AdditionalStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello How are you?";
        String[] allTokens = input.split(" ");
        String[] twoTokens = input.split(" ", 2);
        for (String element : allTokens)
        {
            System.out.print(element + "--");
        }
        System.out.println();
        for (String element : twoTokens)
        {
            System.out.print(element + "--");
        }
        System.out.println();
        System.out.println("Unicode code point of element at index 0 : " + "apple".codePointAt(0));
        System.out.println("Unicode code point of element before index 1 : " + "apple".codePointBefore(1));
        System.out.println("Number of code Points between indices 1 and 4 " + "apple".codePointCount(1, 4));
        System.out.println("Checks if apple contains ppl : " + "apple".contains("ppl"));
        System.out.println("ContentEquals checks if the content in invoking and argument string are equal : " + "apple".contentEquals("apple"));
        System.out.println("Returns true when both the string patterns match : " + "apple".matches("apple"));
        System.out.println("Checks if the string is empty :" + " ".isEmpty());
        System.out.println("Replaces the first charsequence with argument passed : " + "appleapple".replaceFirst("le", "let"));
        System.out.println("Replaces the charsequence with argument passed in the string : " + "appleapple".replaceAll("le", "let"));
        //System.out.println("apple".codePointBefore(0)); //IndexOutOfBoundsException 
        System.out.println("apple".contains("plp"));
        System.out.println("apple".contentEquals("pplea"));
	}

}
		/*String input = "Hello How are you?";
		String[] tokens = input.split(" ", 6);
		for (int i = 0; i < tokens.length; i++) 
		{
		    System.out.print(tokens[i] + "--");
		}
	}}*/
