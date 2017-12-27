package wrapperClasses;

public class BooleanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean a = new Boolean(true);
        Boolean b = new Boolean(false);
        Boolean c = new Boolean(false);        
        System.out.println("Boolean value of a : " + a.booleanValue());
        System.out.println("Comparison of b and c using compare : " + Boolean.compare(b, c));
        System.out.println("CompareTo of c and a : " + c.compareTo(a));
        System.out.println("Equals of b and c : " + b.equals(c));        
        System.setProperty("Isboolean", "false");
        System.out.println("Get Boolean from Isboolean : " + Boolean.getBoolean("Isboolean"));        
        System.out.println("Hash code for Boolean : " + c.hashCode());
        System.out.println("ParseBoolean converts String toboolean : " + Boolean.parseBoolean("true"));
        System.out.println("Boolean is converted into String : " + b.toString());
        System.out.println("Boolean is converted into String : " + Boolean.toString(a));
        System.out.println("Converts Boolean into Boolean : " + Boolean.valueOf(a));
        System.out.println("Converts String into Boolean : " + Boolean.valueOf("true"));
	}

}
