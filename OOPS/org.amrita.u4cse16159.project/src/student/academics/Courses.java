package student.academics;

import java.io.Serializable;

public class Courses implements Serializable {
	private String courseName;
	private int credits;
	private String courseCode;
	private StudentMarks studentMarks;

	public Courses(){
		//Default Constructor
	}

	public Courses(String subject,
				   int credits,
				   String courseCode,
				   StudentMarks studentMarks) {
		this.courseName = subject;
		this.credits = credits;
		this.studentMarks = studentMarks;
		this.courseCode = courseCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public StudentMarks getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(StudentMarks studentMarks) {
		this.studentMarks = studentMarks;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String toString() {
		return "\n   Courses Code : " + getCourseCode() + " | Courses: "
				+ getCourseName() + " | Credits: " + getCredits() + "\n   StudentMarks: " + getStudentMarks();
	}

}
