package myfirstproject1;

public class RefrencesAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student ();
		Student st2 = new Student();
		Student st5 = new Student();
		st2=st5;
		
		st1.name = "Rajesh";
		st2.marks = 87;
		st1.section = 'C';
		st5.name = "Mahesh";
		st5.marks = 88;
		st5.section = 'A';
		System.out.println("Print using st1 : "+st1.name+""+st1.marks+""+st1.section);
		System.out.println("Print using st2 : "+st2.name+""+st2.marks+""+st2.section);
		System.out.println("Print st5 : "+st5.name+" "+st5.marks+" "+st5.section);
	}

}

class Student
{
	String name;
	int marks;
	char section;
}