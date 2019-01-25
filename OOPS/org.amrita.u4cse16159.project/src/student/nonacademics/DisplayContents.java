package student.nonacademics;

import student.academics.Student;

public class DisplayContents {

    private Student student;

    public DisplayContents(Student student){
        this.student = student;
    }

    public void displayAllArrearContents(){
        NonAcademics nonAcademics = student.getNonAcademics();
        StudentArrears studentArrears = nonAcademics.getStudentArrears();
        int counter = 1;
        System.out.println("Number of StudentArrears : "+ studentArrears.getNumberOfArrears());

        for(String iterator : studentArrears.getArrearSubjects()){
            System.out.println(counter +" -> "+ iterator);
            counter++;
        }
    }

    public void displayAllSuspensionsContents(){
        NonAcademics nonAcademics = student.getNonAcademics();
        StudentSuspensions studentSuspensions = nonAcademics.getStudentSuspensions();
        int counter = 1;
        System.out.println("Number of times the student got suspended : "+ studentSuspensions.getSuspensionCount());

        for(String iterator : studentSuspensions.getReasonOfSuspensionList()){
            System.out.println(counter +" -> "+iterator);
            counter++;
        }
    }

    public void displayAllInternshipContents(){
        NonAcademics nonAcademics = student.getNonAcademics();
        StudentInternships studentInternships = nonAcademics.getStudentInternships();
        int counter = 1;
        System.out.println("Number of studentInternships attended by the student : "+ studentInternships.getNumberOfInternships());

        for(String iterator : studentInternships.getListOfInternships()){
            System.out.println(counter + " -> "+iterator);
            counter++;
        }
    }

    public void displayAllProjects(){
        NonAcademics nonAcademics = student.getNonAcademics();
        StudentProjects studentProjects = nonAcademics.getProject();
        int counter = 1;
        System.out.println("Number of studentProjects on which the student worked on : "+ studentProjects.getNumberOfProjects());

        for(String iterator : studentProjects.getProjectNames()){
            System.out.println(counter + " -> "+iterator);
            counter++;
        }
    }

    public void displayAllSeminarContents(){
        NonAcademics nonAcademics = student.getNonAcademics();
        StudentSeminars studentSeminars = nonAcademics.getSeminar();
        System.out.println("Number of studentSeminars attended : "+ studentSeminars.getNumberOfSeminarsAttended());
        System.out.println("Number of studentSeminars taken : "+ studentSeminars.getNumberOfSeminarsTaken());
    }

    public void displayAllSportsContent(){
        NonAcademics nonAcademics = student.getNonAcademics();
        StudentSports studentSports = nonAcademics.getStudentSports();
        int counter = 1;
        System.out.println("Total number of events in which the student participated : "+ studentSports.getNumberOfEventsParticipated());

        for(String iterator : studentSports.getEventNames()){
            System.out.println(counter +" -> "+iterator);
            counter++;
        }

        System.out.println("\n--------------------------------------------\n");
        System.out.println("Gold medals won : "+ studentSports.getNumberOfGoldMedalsWon());
        System.out.println("Silver medals won : "+ studentSports.getNumberOfSilverMedalsWon());
        System.out.println("Bronze medals won : "+ studentSports.getNumberOfBronzeMedalsWon());
    }

    public void displayAllVolunteeringContents(){
        NonAcademics nonAcademics = student.getNonAcademics();
        StudentVolunteer studentVolunteer = nonAcademics.getStudentVolunteer();
        int counter = 1;
        System.out.println("Number of events in which a student volunteered to be a part of : "+ studentVolunteer.getNumberOfEventsVolunteered());

        for(String iterator : studentVolunteer.getVolunteeredEvents()){
            System.out.println(counter + " -> "+iterator);
            counter++;
        }
    }

    public void displayAllNonAcademicContents(){
        displayAllArrearContents();
        displayAllSuspensionsContents();
        displayAllInternshipContents();
        displayAllProjects();
        displayAllSeminarContents();
        displayAllSportsContent();
        displayAllVolunteeringContents();
    }

}
