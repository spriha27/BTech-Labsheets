package student.nonacademics;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentArrears implements Serializable{


    private ArrayList<String> arrearSubjects = new ArrayList<>();
    private int numberOfArrears;

    public StudentArrears() {
        //Default
    }

    public StudentArrears(ArrayList<String> arrearSubjects, int numberOfArrears) {
        this.arrearSubjects = arrearSubjects;
        this.numberOfArrears = numberOfArrears;
    }

    public int getNumberOfArrears() {
        return numberOfArrears;
    }

    public void setNumberOfArrears(int numberOfArrears) {
        this.numberOfArrears = numberOfArrears;
    }

    public ArrayList<String> getArrearSubjects() {
        return arrearSubjects;
    }

    public void setArrearSubjects(String course) {
        arrearSubjects.add(course);
    }
}
