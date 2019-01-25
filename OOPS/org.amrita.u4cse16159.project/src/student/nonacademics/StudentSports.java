package student.nonacademics;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentSports implements Serializable{

    private ArrayList<String> eventNames;
    private int numberOfGoldMedalsWon;
    private int numberOfSilverMedalsWon;
    private int numberOfBronzeMedalsWon;
    private int numberOfEventsParticipated;

    public StudentSports() {
        eventNames = new ArrayList<>();
        numberOfGoldMedalsWon = 0;
        numberOfSilverMedalsWon = 0;
        numberOfBronzeMedalsWon = 0;
        numberOfEventsParticipated = 0;
    }

    public int getNumberOfGoldMedalsWon() {
        return numberOfGoldMedalsWon;
    }

    public void setNumberOfGoldMedalsWon(int numberOfGoldMedalsWon) {
        this.numberOfGoldMedalsWon = numberOfGoldMedalsWon;
    }

    public int getNumberOfSilverMedalsWon() {
        return numberOfSilverMedalsWon;
    }

    public void setNumberOfSilverMedalsWon(int numberOfSilverMedalsWon) {
        this.numberOfSilverMedalsWon = numberOfSilverMedalsWon;
    }

    public int getNumberOfBronzeMedalsWon() {
        return numberOfBronzeMedalsWon;
    }

    public void setNumberOfBronzeMedalsWon(int numberOfBronzeMedalsWon) {
        this.numberOfBronzeMedalsWon = numberOfBronzeMedalsWon;
    }

    public int getNumberOfEventsParticipated() {
        return numberOfEventsParticipated;
    }

    public void setNumberOfEventsParticipated(int numberOfEventsParticipated) {
        this.numberOfEventsParticipated = numberOfEventsParticipated;
    }

    public void setEventNames(String eventName) {
        eventNames.add(eventName);
    }

    public ArrayList<String> getEventNames() {
        return eventNames;
    }
}
