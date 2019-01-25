package student.nonacademics;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentVolunteer implements Serializable{

    private int numberOfEventsVolunteered;
    private ArrayList<String> volunteeredEvents;

    public StudentVolunteer(){
        volunteeredEvents = new ArrayList<>();
        numberOfEventsVolunteered = 0;
    }

    public ArrayList<String> getVolunteeredEvents() {
        return volunteeredEvents;
    }

    public void setVolunteeredEvents(String eventName) {
        volunteeredEvents.add(eventName);
    }

    public int getNumberOfEventsVolunteered() {
        return numberOfEventsVolunteered;
    }

    public void setNumberOfEventsVolunteered(int numberOfEventsVolunteered) {
        this.numberOfEventsVolunteered = numberOfEventsVolunteered;
    }

}
