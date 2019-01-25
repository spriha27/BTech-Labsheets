package diary;

import student.academics.Courses;
import student.academics.StudentMarks;
import student.academics.Student;
import student.nonacademics.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static diary.NewDiary.setReasonForSuspensionMessage;

public class StudentInformation {

    private Student student;
    private Courses courses;
    private int numberOfCourses;
    private StudentArrears studentArrears;
    private StudentInternships studentInternships;
    private StudentProjects studentProjects;
    private StudentSeminars studentSeminars;
    private StudentSports studentSports;
    private StudentSuspensions studentSuspensions;
    private StudentVolunteer studentVolunteer;
    private NonAcademics nonAcademics;


    private StudentMarks studentMarks;
    private BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    public StudentInformation() {
        student = null;
        courses = null;
        studentMarks = null;
        numberOfCourses = 0;
    }

    public Student getStudent() {
        return student;
    }

    public Courses setCourseToBeTaken() throws Exception {
        courses = new Courses();

        NewDiary.displayCourseDetailsPage();

        NewDiary.displaySetCourseNameMessage();
        courses.setCourseName(bfr.readLine());

        NewDiary.displaySetCourseCodeMessage();
        courses.setCourseCode(bfr.readLine());

        NewDiary.displaySetCreditsMessage();
        courses.setCredits(Integer.parseInt(bfr.readLine()));

        courses.setStudentMarks(setAllMarksToZero());
        student.setCoursesTakenList(courses);

        return courses;
    }

    public Courses modifyCourseToBeTaken(Student student) throws Exception {
        courses = new Courses();

        NewDiary.displayCourseDetailsPage();

        NewDiary.displaySetCourseNameMessage();
        courses.setCourseName(bfr.readLine());

        NewDiary.displaySetCourseCodeMessage();
        courses.setCourseCode(bfr.readLine());

        NewDiary.displaySetCreditsMessage();
        courses.setCredits(Integer.parseInt(bfr.readLine()));

        courses.setStudentMarks(setAllMarksToZero());
        student.setCoursesTakenList(courses);

        return courses;
    }


    public StudentMarks setMarksOfCoursesTaken() throws Exception {
        studentMarks = new StudentMarks();

        NewDiary.displayMarksPage();

        NewDiary.displaySetFirstInternalsMarksMessage();
        studentMarks.setFirstInternals(Double.parseDouble(bfr.readLine()));

        NewDiary.displaySetSecondPeriodicalMarksMessage();
        studentMarks.setSecondInternals(Double.parseDouble(bfr.readLine()));

        NewDiary.displaySetEndSemesterExamMarksMessage();
        studentMarks.setEndSem(Double.parseDouble(bfr.readLine()));

        NewDiary.displaySetContinuousEvaluationMarksMessage();
        studentMarks.setContinuousEvaluationMarks(Double.parseDouble(bfr.readLine()));

        NewDiary.displaySetAttendanceMessage();
        studentMarks.setAttendance(Double.parseDouble(bfr.readLine()));

        courses.setStudentMarks(studentMarks);

        return studentMarks;
    }

    public StudentMarks setAllMarksToZero() {

        studentMarks = new StudentMarks();

        studentMarks.setFirstInternals(0.0);
        studentMarks.setSecondInternals(0.0);
        studentMarks.setEndSem(0.0);
        studentMarks.setContinuousEvaluationMarks(0.0);
        studentMarks.setAttendance(0.0);

        return studentMarks;
    }

    public Student modifyStudentDetails(Student student) throws Exception {
        NewDiary.displayStudentDetailsPage();

        NewDiary.displaySetNameMessage();
        student.setName(bfr.readLine());

        NewDiary.displaySetBatchMessage();
        student.setBatch(bfr.readLine());

        NewDiary.displaySetNumberOfCourses();
        numberOfCourses = Integer.parseInt(bfr.readLine().trim());

        while (numberOfCourses-- > 0) {
            student.addCourseToCourseList(modifyCourseToBeTaken(student));
        }

        return student;
    }

    public Student setAllStudentDetails() throws Exception {
        student = new Student();
        NewDiary.displayStudentDetailsPage();

        NewDiary.displaySetNameMessage();
        student.setName(bfr.readLine());

        NewDiary.displaySetRollNoMessage();
        String input = bfr.readLine();
        String garbage[] = input.split("[^0-9]+");
        student.setRollNumber(garbage[garbage.length - 1]);

        NewDiary.displaySetBatchMessage();
        student.setBatch(bfr.readLine());

        NewDiary.displaySetNumberOfCourses();
        numberOfCourses = Integer.parseInt(bfr.readLine().trim());

        while (numberOfCourses-- > 0) {
            student.addCourseToCourseList(setCourseToBeTaken());
        }

        NewDiary.displayNonAcademicsPage();
        setAllNonAcademicDetails();

        return student;
    }

    public void displayAllStudentDetails(Student student) {
        System.out.println(student.toString());
    }

    public StudentArrears setArrearDetails() throws Exception {
        NewDiary.displayArrearsPage();
        studentArrears = new StudentArrears();

        NewDiary.setNumberOfArrearsMessage();
        studentArrears.setNumberOfArrears(Integer.parseInt(bfr.readLine()));

        int numberOfArrears = studentArrears.getNumberOfArrears();


        if(numberOfArrears!=0){
            NewDiary.setArrearsSubjectMessage();
            while (numberOfArrears-- > 0) {
                studentArrears.setArrearSubjects(bfr.readLine());
            }
        }

        return studentArrears;
    }

    public StudentInternships setAllInternshipDetails() throws IOException {
        studentInternships = new StudentInternships();

        NewDiary.displayInternshipPage();

        NewDiary.setNumberOfInternshipsMessage();
        studentInternships.setNumberOfInternships(Integer.parseInt(bfr.readLine()));

        int numberOfInternships = studentInternships.getNumberOfInternships();

        if(numberOfInternships!=0){
            NewDiary.setNameOfInterningOrganizationMessage();
            while (numberOfInternships-- > 0) {
                studentInternships.setListOfInternships(bfr.readLine());
            }
        }

        return studentInternships;
    }

    public StudentProjects setAllProjectDetails() throws IOException {
        studentProjects = new StudentProjects();

        NewDiary.displayProjectsPage();

        NewDiary.setNumberOfProjectCompletedMessage();
        studentProjects.setNumberOfProjects(Integer.parseInt(bfr.readLine()));

        int numberOfProjects = studentProjects.getNumberOfProjects();

        if(numberOfProjects!=0){
            NewDiary.setProjectNameMessage();
            while (numberOfProjects-- > 0) {
                studentProjects.setProjectNames(bfr.readLine());
            }
        }

        return studentProjects;
    }

    public StudentSeminars setAllSeminarDetails() throws IOException {

        studentSeminars = new StudentSeminars();

        NewDiary.displaySeminarsPage();

        NewDiary.setNumberOfSeminarsAttededMessage();
        studentSeminars.setNumberOfSeminarsAttended(Integer.parseInt(bfr.readLine()));

        NewDiary.setNumberOfSeminarsTakenMessage();
        studentSeminars.setNumberOfSeminarsTaken(Integer.parseInt(bfr.readLine()));

        return studentSeminars;
    }

    public StudentSports setAllSportDetails() throws IOException {

        studentSports = new StudentSports();

        NewDiary.displaySportsPage();

        NewDiary.setNumberOfEventsParticiptedMessage();
        studentSports.setNumberOfEventsParticipated(Integer.parseInt(bfr.readLine()));

        int numberOfEventsParticipated = studentSports.getNumberOfEventsParticipated();


        if(numberOfEventsParticipated!=0){
            NewDiary.setEventNameMessage();
            while (numberOfEventsParticipated-- > 0) {
                studentSports.setEventNames(bfr.readLine());
            }
            NewDiary.setNumberOfGoldMedalsWonMessage();
            studentSports.setNumberOfGoldMedalsWon(Integer.parseInt(bfr.readLine()));

            NewDiary.setNumberOfSilverMedalsWonMessage();
            studentSports.setNumberOfSilverMedalsWon(Integer.parseInt(bfr.readLine()));

            NewDiary.setNumberOfBronzeMedalsWonMessage();
            studentSports.setNumberOfBronzeMedalsWon(Integer.parseInt(bfr.readLine()));
        }

        return studentSports;
    }

    public StudentSuspensions setAllSuspensionDetails() throws IOException {
        studentSuspensions = new StudentSuspensions();

        NewDiary.displaySuspensionPage();

        NewDiary.setSuspensionCountMessage();
        studentSuspensions.setSuspensionCount(Integer.parseInt(bfr.readLine()));

        int suspensionCount = studentSuspensions.getSuspensionCount();

        if(suspensionCount!=0){
            setReasonForSuspensionMessage();
            while (suspensionCount-- > 0) {
                studentSuspensions.setReasonOfSuspensionList(bfr.readLine());
            }
        }


        return studentSuspensions;
    }

    public StudentVolunteer setAllVolunteeringDetails() throws IOException {
        studentVolunteer = new StudentVolunteer();

        NewDiary.displayVolunterringPage();

        NewDiary.setNumberOfEventsVolunteeredMessage();
        studentVolunteer.setNumberOfEventsVolunteered(Integer.parseInt(bfr.readLine()));

        int numberOfEventsVolunteered = studentVolunteer.getNumberOfEventsVolunteered();

        if(numberOfEventsVolunteered != 0){
            NewDiary.setNameOfEventVolunteeredMessage();
            while (numberOfEventsVolunteered-- > 0) {
                studentVolunteer.setVolunteeredEvents(bfr.readLine());
            }
        }

        return studentVolunteer;
    }


    public NonAcademics setAllNonAcademicDetails() throws Exception {
        nonAcademics = new NonAcademics();

        nonAcademics.setStudentArrears(setArrearDetails());
        nonAcademics.setStudentSuspensions(setAllSuspensionDetails());
        nonAcademics.setStudentInternships(setAllInternshipDetails());
        nonAcademics.setProject(setAllProjectDetails());
        nonAcademics.setSeminar(setAllSeminarDetails());
        nonAcademics.setStudentSports(setAllSportDetails());
        nonAcademics.setStudentVolunteer(setAllVolunteeringDetails());
        student.setNonAcademics(nonAcademics);
        return nonAcademics;
    }

}
