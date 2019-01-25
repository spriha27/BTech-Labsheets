package student.nonacademics;

import java.io.Serializable;

public class NonAcademics implements Serializable {

    private StudentSports studentSports;
    private StudentVolunteer studentVolunteer;
    private StudentSeminars seminar;
    private StudentProjects project;
    private StudentInternships studentInternships;
    private StudentArrears studentArrears;
    private StudentSuspensions studentSuspensions;

    public StudentArrears getStudentArrears() {
        return studentArrears;
    }

    public void setStudentArrears(StudentArrears studentArrears) {
        this.studentArrears = studentArrears;
    }

    public StudentSuspensions getStudentSuspensions() {
        return studentSuspensions;
    }

    public void setStudentSuspensions(StudentSuspensions studentSuspensions) {
        this.studentSuspensions = studentSuspensions;
    }

    public StudentSports getStudentSports() {
        return studentSports;
    }

    public void setStudentSports(StudentSports studentSports) {
        this.studentSports = studentSports;
    }

    public StudentVolunteer getStudentVolunteer() {
        return studentVolunteer;
    }

    public void setStudentVolunteer(StudentVolunteer studentVolunteer) {
        this.studentVolunteer = studentVolunteer;
    }

    public StudentSeminars getSeminar() {
        return seminar;
    }

    public void setSeminar(StudentSeminars seminar) {
        this.seminar = seminar;
    }

    public StudentProjects getProject() {
        return project;
    }

    public void setProject(StudentProjects project) {
        this.project = project;
    }

    public StudentInternships getStudentInternships() {
        return studentInternships;
    }

    public void setStudentInternships(StudentInternships studentInternships) {
        this.studentInternships = studentInternships;
    }


}
