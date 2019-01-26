/*
            File Name: StudentDriver.java
            Roll Number: u4cse16159
            Name: Spriha Mandal
            Submitted on: 3rd August 2017
*/

	import java.io.*;
	
	public class StudentDriver{
	public static void main(String[] args){
	Student ram = new Student( "Ram", 12345, "Cse");
	Student seeta = new Student("Seeta", 54321, "Ece");
	ram.swap(seeta);
	ram.display();
	seeta.display();
	}
}
