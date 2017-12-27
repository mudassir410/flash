package string;
/*
public class Strings {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
        System.out.println("~" + s + "~");
        String s1 = "Merit Campus "; 
        System.out.println(s1); 
        String s2 = new String("Online Java learning tool, "); 
        System.out.println(s2);
        byte b[] = {65, 66, 67, 68, 69};
        String s4 = new String(b);
        System.out.println(s4);
        char characters[] = {'M', 'e', 'r', 'i', 't', ' ', 'C', 'a', 'm', 'p', 'u', 's'};
        String s3 = new String(characters);
        System.out.println(s3);  
        String s5 = s1 + s2 + " improves programming skills.";
        System.out.println(s5);
	}
}
*/
  /* public static void main(String arg[])
    {
        String place = "Hyderabad";
        String number = "12345";
        String hello = "Hello World";
        int length = place.length();
        int length1 = number.length();
        int length2 = hello.length();
        System.out.println("String Length of " + place + " is : " + length);
        System.out.println("String Length of " + number + " is : " + length1);
        System.out.println("String Length of " + hello + " is : " + length2);

        
        String welcome = "Welcome to Merit Campus";
        for (int i = 0; i < welcome.length(); i++)
        {
            System.out.print(welcome.charAt(i));
        }    
    }
}*/
/*
public static void main(String arg[])
{
    String literalone = "abc";
    String literaltwo = "abc";
    String obj_ref = new String("abc");
    obj_ref = literaltwo;
    String s2 = new String();
    if (literalone == literaltwo)
    {
        System.out.println("literalone and literaltwo are refering to same object.");
    } 
    else
    {
        System.out.println("literalone and literaltwo are not refering to same object.");
    }
    if (literaltwo == obj_ref)
    {
        System.out.println("literaltwo and obj_ref are refering to same object.");
    } 
    else
    {
        System.out.println("literaltwo and obj_ref are not refering to same object.");
    }
    if (literaltwo.equals(s2))
    {
        System.out.println("literaltwo and obj_ref are having same content.");
    } 
    else
    {
        System.out.println("literaltwo and obj_ref are having different content.");
    }    
}
}*/
/*
class StringConcatenationTest
{
    public static void main(String arg[])
    {
        String s1 = "Aam";
        String s2 = "Admi";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        String s4 = s3 + "Party";
        System.out.println(s4);
        String s5 = "Shaked".concat(" Indian Politics");
        System.out.println(s5);    

//String version = "Java Version".concat(1.7);
//System.out.println(version);
String first = "Merit ";
String second = "Campus";
String third = first.concat(second);
System.out.println(third);
}
}*/

class StringConcatDemo
{
    public static void main(String arg[])
    {
        String str1 = "Welcome ", str2 = " Merit", str3 = " Campus";
        int number = 2;
        str1 = str1 + number + str2 + str3;
        System.out.println(str1);
        str2 = str2.concat(str3);
        System.out.println(str2);
        boolean east = true;
        System.out.println("Sun rises in the east." + "\nThis statement is " + east);
        str1 = null;
        str1 = str1.concat(str2 + str3);
        str1 += number;
        System.out.println(str1);
        // System.out.println("Value=" + number + number);
        // System.out.println("Value=" + ( number + number) );    
    }
}

