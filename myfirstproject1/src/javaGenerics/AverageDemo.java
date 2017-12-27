package javaGenerics;

public class AverageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer integerNumbers[] = {1, 2, 3, 4, 5};
	    Double doubleNumbers[] = {1.5, 2.1, 3.3};
        Average<Integer> integerObject = new Average<Integer>(integerNumbers);
        Average<Double> doubleObject = new Average<Double>(doubleNumbers);
        double average = integerObject.getAverage();
        double average1 = doubleObject.getAverage();
        System.out.println("The average value of given integers is : " + average);
        System.out.println("The average value of given double Numbers is : " + average1);
        String strs[] = {"A", "B", "C", "D"};

      //  Average<String> stringObject = new Average<String>(strs);
	}
}
class Average<T extends Number> { // LINE B    
    T[] numbers;           
    public Average(T[] numbers) 
    {                   
        this.numbers = numbers;
    }
    double getAverage()
    {                    
        double sum = 0.0;                        
        for(int i = 0; i< numbers.length; i++)            
        {
            sum += numbers[i].doubleValue(); // LINE C           
        }            
        return sum / numbers.length;
    }
}
