package string;

public class StartsWithAndEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String status = "Merit Campus is a great place to learn, practise and compete";
        //if (status.startsWith("Merit"))
        if (status.startsWith("MERIT"))

        {
            System.out.println("status string starts with Merit");
        }
        else
        {
            System.out.println("status string does not start with Merit");
        }
        if (status.startsWith("learn", 33))
        {
            System.out.println("status string contains  substring learn that starts at index 33");
        }
        else
        {
            System.out.println("status string does not contain substring learn");
        }
        //if (status.endsWith("complete"))
        if (status.endsWith("Complete"))

        {
            System.out.println("status string ends with compete");
        }
        else
        {
            System.out.println("status string does not end with compete");
        }
        System.out.println("status starts with merit : " + status.startsWith("merit"));
	}

}
