package string;

public class CompareToTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str1 = "The best way to predict your future is to create it";
        //String str2 = "The best way to predict ";
        //String str3 = "your future is to create it";
        String str4 = "LEARN JAVA";
        String str5 = "learn java";
        //String str1 = "Merit Campus";
        //String str2 = "Merit Campus";
        //boolean result = str1.equals(str2);
        //System.out.println(result);
        //int comparisionValue = str1.compareTo(str2);
        //System.out.println(comparisionValue);
        //compare(str1, str2 + str3);
        //compare(str1, str2);
        //compare(str1, str3);
        compare(str4, str5);
    }
    
	//public static void compare(String one, String two){
	public static void compare(String four, String five){

        int result = four.compareTo(five);
        if (result == 0)
        {
            System.out.print("Invoking string and argument string are equal.");
        }
        else if (result < 0)
        {
            System.out.print("The invoking string follows the argument string.");
        }
        else
        {
            System.out.print("The invoking string precedes the argument string.");
        }
        System.out.println(" The comparision value is : " + result);
	}

}
