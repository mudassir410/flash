package string;

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "Hyderabad";
        String two = "HYDERABAD";
        String three = "Hyderabad";
        String four = "Kakinada";
        System.out.println(one + " equals " + three + " -- " + one.equals(three));
        System.out.println(one + " equals " + two + " -- " + one.equals(two));
        System.out.println(one + " equals IgnoreCase " + two + " -- " + one.equalsIgnoreCase(two));
        System.out.println(one + " equals " + four + " -- " + one.equals(four));
	}

}
