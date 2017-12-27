package string;
import java.util.Locale;

public class CaseConvertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MeriT CampuS".toUpperCase();
        System.out.println(str);
        System.out.println(str.toLowerCase());
        str = "turkish";
        Locale locale = new Locale("tr");
        System.out.println("String in Turkish locale is: " + str.toUpperCase(locale));
        System.out.println("String in default locale (English) :" + str.toUpperCase());
        str = "TURKISH";
        System.out.println("String in Turkish locale is: " + str.toLowerCase(locale));
        System.out.println("String in default locale (English) :" + str.toLowerCase()); 
	}

}
