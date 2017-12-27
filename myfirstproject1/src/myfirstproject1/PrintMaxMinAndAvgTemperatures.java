package myfirstproject1;

public class PrintMaxMinAndAvgTemperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double min_temp_in_F = 75.86;
	        double max_temp_in_F = 105.72;
	    
	        double avg_temp_in_F = findAvg(min_temp_in_F,max_temp_in_F);
	    
	        double min_temp_in_C = convertToCelsius( min_temp_in_F );
	        double max_temp_in_C = convertToCelsius( max_temp_in_F );
	        double avg_temp_in_C = convertToCelsius( avg_temp_in_F );
	       
	        System.out.println("Min temp in F = " + min_temp_in_F + ", in C = " + min_temp_in_C);
	        System.out.println("Max temp in F = " + max_temp_in_F + ", in C = " + max_temp_in_C);
	        System.out.println("Avg temp in F = " + avg_temp_in_F + ", in C = " + avg_temp_in_C);
	    
	    }
	    
	    public static double convertToCelsius( double input )
	    {
	        double result = ( input - 32.0 ) * 5.0 / 9.0;
	        return result;
	    }
	    public static double findAvg(double temp1, double temp2)
	    {
	    	return (temp1+temp2)/2.0;
	    }
	}

