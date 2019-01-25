package student.academics;

import java.io.Serializable;

public class StudentMarks implements Serializable {

	private double firstInternals, secondInternals, attendance, endSem, m, contEval;

	public double getFirstInternals() {
		return firstInternals;
	}

	public void setFirstInternals(double value) {
		firstInternals = (value / 50) * 15;
	}

	public double getSecondInternals() {
		return secondInternals;
	}

	public void setSecondInternals(double value) {
		secondInternals = (value / 50) * 15;
	}

	public double getAttendance() {
		return attendance;
	}

	public void setAttendance(double value) {
		attendance = value;
	}

	public void setContinuousEvaluationMarks(double value) {
		contEval = value;
	}

	public double getContinousEvaluationMarks() {
		return contEval;
	}

	public double getEndSem() {
		return endSem;
	}

	public void setEndSem(double value) {
		endSem = value / 2;
	}

	public double getTotalAverage() {
		m = (getFirstInternals() + getFirstInternals() + getAttendance() + getEndSem());
		return m;
	}

	public double getInternalMarks(){
		return getFirstInternals() + getSecondInternals();
	}

	public String getGrade() {
		if (getAttendance() > 0) {
			if (m > 95)
				return "O";
			else if ((m < 95) && (m < 85))
				return "A+";
			else if ((m < 85) && (m > 75))
				return "A";
			else if ((m < 75) && (m > 65))
				return "B+";
			else if ((m < 65) && (m > 55))
				return "B";
			else if ((m < 55) && (m > 45))
				return "C";
			else if ((m < 45) && (m > 35))
				return "P";
			else
				return "F";
		} else
			return "FA";
	}

	public String toString() {
		return "\n        Internal StudentMarks : "+ getInternalMarks()+"\n        End Semester StudentMarks : "+getEndSem()+
				"\n        Average StudentMarks: " + " " + getTotalAverage() + " " + "\n        Grade: " + getGrade();
	}

}
