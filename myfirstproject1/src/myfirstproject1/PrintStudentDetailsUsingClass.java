package myfirstproject1;
import java.lang.*;

public class PrintStudentDetailsUsingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 students[] = new Student1[5];
	    
        students[0] = new Student1();
        students[0].name = "Rajesh";
        students[0].marks = 45;
        students[0].section = 'A';
    
        students[1] = new Student1();
        students[1].name = "Suresh";
        students[1].marks = 78;
        students[1].section = 'B';
    
        students[2] = new Student1();
        students[2].name = "Ramesh";
        students[2].marks = 83;
        students[2].section = 'A';
    
        students[3] = new Student1();
        students[3].name = "Kamlesh";
        students[3].marks = 77;
        students[3].section = 'A';
    
        students[4] = new Student1();
        students[4].name = "Vignesh";
        students[4].marks = 93;
        students[4].section = 'B';
    
    
     //try
     //{
        for(int i = 0; i <= students.length; i++)
        {
            System.out.println( students[i].name + " in section " + students[i].section + " got " + students[i].marks + " marks." );
        }
        System.out.println("for enhanced loop");
        
            
    //}
       /* catch(ArrayIndexOutOfBoundsException aioobe)
        {
        System.out.println("ArrayOutOfBound Error");	
        
        }*/
     for (Student1 i:students){
     	
         System.out.println(i.name + " in section " + i.section + " got " + i.marks + " marks." );
       }
}
}

class Student1
{
    String name;
    int marks;
    char section;
    String address;
    String mobile;
}
