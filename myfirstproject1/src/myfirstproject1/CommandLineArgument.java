package myfirstproject1;

public class CommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if(args.length == 0)
	        {
	            System.out.println("Running the program with no arguments");
	        }
	        else if(args.length == 1)
	        {
	            System.out.println("Running the program with one argument - " + args[0]);
	        } 
	        else if(args.length == 2)
	        {
	            System.out.println("Running the program with two argument - " + args[0] + " and " + args[1]);
	        }
	        else
	        {
	            System.out.println("Invalid number of arguments only 0 or 1 or 2 arguments accepted.");
	    
	        }

	}

}
