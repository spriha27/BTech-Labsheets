import java.io.*;	
import java.util.*;
public class Student implements Serializable
{
	private String name;
	private int rollNo;
	private ArrayList <Course> coursesTaken=new ArrayList <Course>();
	public Student(String n,int r,ArrayList<Course> c)
	{
		name=n;
		rollNo=r;
		this.coursesTaken.addAll(c);
	}
	public String getName()
	{
		return name;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public ArrayList<Course> getCourses(){
		return coursesTaken;
	}
	public String toString(){
		return ("Student: "+this.name+" Roll No: "+this.rollNo);
	}
}