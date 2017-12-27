package myfirstproject1;

public class ClassDataValidation 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student3 adarsh =new Student3("Adarsh");
        adarsh.setSection('B');
        adarsh.setMarks(80);
        adarsh.print("LINE A");    // LINE A
        
        adarsh.setSection('Z');// LINE B
        adarsh.print("LINE B");
        
        adarsh.setMarks(150);// LINE C
        adarsh.print("LINE C");
        
        adarsh.setDetails(90,'C');// LINE D
        adarsh.print("LINE D");    
        
        adarsh.setSection('E');
        adarsh.print("LINE E");//Line D
    }
}

class Student3
{
    String name;
    int marks;
    char section;
    double percentage;

    Student3(String name)
    {
        this.name = name;
    }

    void setMarks(int marks)
    {
        if( marks >=0&& marks <=100)
        {
            this.marks = marks;
        }
    }


    void setSection(char section)
    {
        if( section =='A'|| section =='B'|| section =='C'|| section =='D'|| section =='E')
        {
            this.section = section;
        }
    }

    void setDetails(int marks,char section)
    {
        setMarks(marks);
        setSection(section);
    }
    void setPercentage(double Percentage)
    {
    	setPercentage(Percentage);
    	setPercentage(Percentage);
    }
    void print(String prefix)
    {
        System.out.println(prefix +" : "+ name +" - "+ marks +" - "+ section);

	}

}
