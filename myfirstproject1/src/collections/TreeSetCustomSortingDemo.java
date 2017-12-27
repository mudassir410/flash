package collections;

import java.util.*;

public class TreeSetCustomSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> students = new TreeSet<Student>();
		students.add(new Student("Sreeram", 10, 'A'));
        students.add(new Student("Karthik", 12, 'A'));
        students.add(new Student("Ram", 14, 'B'));
        students.add(new Student("Yeshwanthi", 5, 'C'));
        students.add(new Student("Bhavya", 6, 'D'));
        System.out.println(students);
        TreeSet newStudents = (TreeSet) students.clone();
        System.out.println("After clone :"+newStudents);
	}

}

class Student implements Comparable<Student>
{
	String name;
	int rollNumber;
	char section;
	public Student(String name, int rollNumber, char section)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.section = section;
	}
	public String toString()
	{
		return name +" "+rollNumber+" "+section;
	}
	public int compareTo(Student o)
	{
		return rollNumber-o.rollNumber;
	}
}