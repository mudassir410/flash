package wrapperClasses;

public class VoidExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodScore(600);
    }
    public static void methodScore(int marks)
    {
        if (marks >= 450)
        {
            System.out.println("Distinction");
        }
        else if (marks >= 360)
        {
            System.out.println("First Class");
        }
        else
        {
            System.out.println("Just Pass");
        }
	}

}
