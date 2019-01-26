import java.io.*;

public class Student implements Serializable{
	private String name;
	private int rollno;
	
	public Student(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	public String getName(){
		return name;
	}
	public int getRollNo(){
		return rollno;
	}
}

