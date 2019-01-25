package student.nonacademics;

import java.io.Serializable;

public class StudentSeminars implements Serializable{

    private int numberOfSeminarsAttended;
    private int numberOfSeminarsTaken;

    public int getNumberOfSeminarsAttended() {
        return numberOfSeminarsAttended;
    }

    public void setNumberOfSeminarsAttended(int numberOfSeminarsAttended) {
        this.numberOfSeminarsAttended = numberOfSeminarsAttended;
    }

    public int getNumberOfSeminarsTaken() {
        return numberOfSeminarsTaken;
    }

    public void setNumberOfSeminarsTaken(int numberOfSeminarsTaken) {
        this.numberOfSeminarsTaken = numberOfSeminarsTaken;
    }

    @Override
    public String toString(){
        return numberOfSeminarsAttended + " " + numberOfSeminarsTaken;
    }

}
