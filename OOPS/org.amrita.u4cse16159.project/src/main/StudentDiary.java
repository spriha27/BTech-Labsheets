package main;

import diary.StudentInformation;
import diary.ReadWriteStudent;
import diary.ExistingDiary;
import diary.NewDiary;
import diary.FirstPage;
import student.academics.Student;
import student.nonacademics.DisplayContents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class StudentDiary {

    private int selectedStudentRollNumber;
    private Student selectedStudent;
    private int diaryType;


    public StudentDiary() {
        //Default
    }

    public static boolean checkInput(int input) {
        if (input > 4 || input < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        try {
            Student student;
            ReadWriteStudent readWriteStudent = new ReadWriteStudent();
            StudentDiary studentDiary = new StudentDiary();
            StudentInformation assimilator = new StudentInformation();
            Scanner scanner = new Scanner(System.in);
            FirstPage.sayHello();
            FirstPage.selectDiaryTypeMessage();

            studentDiary.setDiaryType();

            switch (studentDiary.getDiaryType()) {
                case 1:
                    NewDiary.displayNumberOfStudentsToBeCreated();
                    int numberOfStudentsToBeCreated = scanner.nextInt();
                    while (numberOfStudentsToBeCreated-- > 0) {
                        student = assimilator.setAllStudentDetails();
                        readWriteStudent.addToStudentList(student);
                        readWriteStudent.writeToFile();
                    }
                    break;
                case 2:
                    ArrayList<Student> stuList = readWriteStudent.readFromFile();
                    if (stuList.isEmpty()) {
                        System.err.println("Currently, there are no students registered");
                    } else {
                        Collections.sort(stuList);
                        for (Student iterator : stuList) {
                            System.out.println(iterator.getRollNumber());
                        }
                        ExistingDiary.selectStudentRollNumber();
                        studentDiary.setSelectedStudentRollNumber(scanner.nextInt());

                        for (Student iterator : stuList) {
                            if (Integer.parseInt(iterator.getRollNumber()) == studentDiary.getSelectedStudentRollNumber()) {
                                studentDiary.selectedStudent = iterator;
                            }
                        }

                        ExistingDiary.displayModificationPage();
                        System.out.println();
                        assimilator.modifyStudentDetails(studentDiary.selectedStudent);
                        assimilator.setMarksOfCoursesTaken();
                        readWriteStudent.writeToFile(stuList);
                    }
                    break;
                case 3:
                    ArrayList<Student> displayStudentList = readWriteStudent.readFromFile();
                    Collections.sort(displayStudentList);
                    if (displayStudentList.isEmpty()) {
                        System.err.println("Sorry, currently there are no students registered");
                    } else {
                        for (Student iterator : displayStudentList) {
                            assimilator.displayAllStudentDetails(iterator);
                            DisplayContents displayContents = new DisplayContents(iterator);
                            displayContents.displayAllNonAcademicContents();
                        }
                    }
                    break;
                case 4:
                    ArrayList<Student> deleteStudentList = readWriteStudent.readFromFile();
                    if (deleteStudentList.isEmpty()) {
                        System.err.println("Sorry, there is currently nothing to display");
                    } else {
                        Collections.sort(deleteStudentList);
                        int index = 0;
                        for (Student iterator : deleteStudentList) {
                            System.out.println(index + " -> " + iterator.getName());
                            index++;
                        }
                        ExistingDiary.displayDeleteStudentMessage();
                        deleteStudentList.remove(scanner.nextInt());
                        readWriteStudent.writeToFile(deleteStudentList);
                    }
                    break;
            }
        }catch (Exception e){
            System.err.println("Error");
        }
    }

    public int getSelectedStudentRollNumber() {
        return selectedStudentRollNumber;
    }

    public void setSelectedStudentRollNumber(int selectedStudentRollNumber) {
        this.selectedStudentRollNumber = selectedStudentRollNumber;
    }

    public int getDiaryType() {
        return diaryType;
    }

    public int setDiaryType() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            diaryType = scanner.nextInt();
            if (checkInput(diaryType)) {
                System.err.println("Please select a suitable option");
            } else {
                break;
            }
        }
        return diaryType;
    }
}
