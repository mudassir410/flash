package string;

public class ReplaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Moon is bright";
        System.out.println(sentence);
		String sentence2 = sentence.replace('M', 'N');
        System.out.println(sentence2);
        sentence = sentence + " Moon";
        System.out.println(sentence);
        String sentence3 = sentence.replace("Moon", "Sun");
        System.out.println(sentence3);
        String sentence4 = "Learn Java";
        String s = sentence4.replace("LEARN", "Do");
        System.out.println(s);
        String sentence5 = "Merit Campus online Java tool.";
        String s1 = sentence5.replace("Java", "Java learning");
        System.out.println(s1);
	}

}
