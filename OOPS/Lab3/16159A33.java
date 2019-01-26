/*
            File Name: HODReport.java
            Roll Number: u4cse16159
            Name: Spriha Mandal
            Submitted on: 9th August 2017
*/
import java.io.*;
public class HODReport{
	FileInputStream in = new FileInputStream("input3.txt");
	FileOutputStream out = new FileOutputStream("output.txt");
	private String name;
	private int roll;
	private int fp;
	private int sp;
	
	HODReport( String name, int roll, int fp, int sp){
		this.name = name;
		this.roll = roll;
		this.fp = fp;
		this.sp = sp;
		out.write(roll);
		out.write(name);
		out.write(fp);
		out.write(sp);
		}
	public int getInternalMarks(){
		return fp+sp;
	}
	
	public void print(int n){
		System.out.println(name+ " got " + n + " marks.");
	}
}
