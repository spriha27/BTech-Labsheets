package student.nonacademics;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentProjects implements Serializable{

    private ArrayList<String> projectNames;
    private int numberOfProjects;

    public StudentProjects(){
        projectNames = new ArrayList<>();
        numberOfProjects = 0;
    }

    public ArrayList<String> getProjectNames() {
        return projectNames;
    }

    public void setProjectNames(String projectName) {
        projectNames.add(projectName);
    }

    public int getNumberOfProjects() {
        return numberOfProjects;
    }

    public void setNumberOfProjects(int numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }

}
