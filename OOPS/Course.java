import java.io.*;
import java.util.ArrayList;
public class Course implements Serializable
{
	private String name;
	private int credits;
	
	public Course(int r,String n)
	{
		name=n;
		credits=r;
		//this.coursesTaken.addAll(c);
	}
	public String getName()
	{
		return name;
	}
	public int getCredits()
	{
		return credits;
	}
	
	public String toString(){
		return ("Course: "+this.name+" Credits: "+this.credits);
	}

}