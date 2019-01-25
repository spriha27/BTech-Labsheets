/*
            File Name: StudentMarks.java
            Roll Number: u4cse16159
            Name: Spriha Mandal
            Submitted on: 9th August 2017
*/
public class StudentMarks{
	private String name;
	private int roll;
	private int fp;
	private int sp;
	
	StudentMarks( String name, int roll, int fp, int sp){
		this.name = name;
		this.roll = roll;
		this.fp = fp;
		this.sp = sp;
	}
	public int getInternalMarks(){
		return fp+sp;
	}
	
	public void print(int n){
		System.out.println(name+ " got " + n + " marks.");
	}
}
