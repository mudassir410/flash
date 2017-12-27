package string;

public class ToCharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "Hyderabad";
        char[] char_one = one.toCharArray();
        //String one = "";
        //char[] char_one = one.toCharArray();
        System.out.println(one);
        for (int i = 0; i < char_one.length; i++) 
        {
            System.out.print(char_one[i] + " ");
        }
	}

}
