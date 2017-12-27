package string;

public class StringSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The Sun rises in the east and sets in the west.";
		//System.out.println("indexOf(c) : " + str.indexOf('c'));
		System.out.println("lastIndexOf(st, 0) : " + str.lastIndexOf("st", 0));
		System.out.println("indexOf(a) : " + str.indexOf(97));
		System.out.println("Length of str : " + str.length());
        System.out.println("indexOf(i) : " + str.indexOf('i'));
        System.out.println("lastIndexOf(i) : " + str.lastIndexOf('i'));
        System.out.println("indexOf(st) : " + str.indexOf("st"));
        System.out.println("lastIndexOf(st) : " + str.lastIndexOf("st"));
        System.out.println("indexOf(e, 2) : " + str.indexOf('e', 2));
        System.out.println("lastIndexOf(e, 46) : " + str.lastIndexOf('e', 46));
        System.out.println("indexOf(st, 2) : " + str.indexOf("st", 2));
        System.out.println("lastIndexOf(st, 46) : " + str.lastIndexOf("st", 46));
	}

}
