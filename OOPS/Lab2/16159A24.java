/*
            File Name: Student.java
            Roll Number: u4cse16159
            Name: Spriha Mandal
            Submitted on: 3rd August 2017
*/

	import java.io.*;
	public class Student{
	public String name;
	public int rollnum;
	public String branch;

	Student(){
		name="name";
		rollnum=0;
		branch="branch";
	}
	Student(String s, int n, String b){
		name=s;
		rollnum=n;
		branch=b;
	}
	public void display(){
		System.out.println("Name of the student is: " + name + ", Roll Number is: " + rollnum + " and Branch is: " + branch + ".");
	}

	public void swap(Student s2){
		String stemp,btemp;
		int temp;
		stemp=name;
		temp=rollnum;
		btemp=branch;
		name=s2.name;
		rollnum=s2.rollnum;
		branch=s2.branch;
		s2.name=stemp;
		s2.rollnum=temp;
		s2.branch=btemp;
	}
}
