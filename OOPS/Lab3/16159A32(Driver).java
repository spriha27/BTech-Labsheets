/*
            File Name: StudentMarksDriver.java
            Roll Number: u4cse16159
            Name: Spriha Mandal
            Submitted on: 9th August 2017
*/
import java.util.*;
public class StudentMarksDriver{
	
	public static void main (String args[]) {
		StudentMarks sid = new StudentMarks("Sid",157,49,49);
		StudentMarks aru = new StudentMarks("Aru",113,50,50);
		int sidm = sid.getInternalMarks();
		int arum = aru.getInternalMarks();
		aru.print(arum);
		sid.print(sidm);
	}
}

