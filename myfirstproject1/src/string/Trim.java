package string;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "   ToMerit   ";
        System.out.println("Before using trim : ");
        System.out.println(s1);
        String s2 = "Welcome" + s1.trim() + "Campus";
        System.out.println("After using trim : ");
        System.out.println(s2.trim());
        String s3 = " Welcome To Merit Campus ";
        System.out.println("Before using trim : ");
        System.out.println(s3);
        System.out.println("After using trim s3 : ");
        System.out.println(s3.trim());
        String s5 = s1.trim();
        String str = "          Java            Programming        ";
        System.out.println(str.replaceAll(" ", ""));
        //String str = null;
        //System.out.println(str.trim()); //java.lang.NullPointerException
        String name = "      Merit Campus         ";
        System.out.println(name.replace("      Merit Campus         ", "Merit Campus"));
        if (s1 == s5)
        {
            System.out.println("s1 and s5 are Equal");
        } else
        {
            System.out.println("s1 and s5 are Not Equal");
        }
        String s6 = "Welcome to Merit Campus";
        String s7 = s6.trim();
        if (s6 == s7)
        {
            System.out.println("s6 and s7 are Equal");
        } else
        {
            System.out.println("s6 and s7 are Not Equal");
        }
	}
}
