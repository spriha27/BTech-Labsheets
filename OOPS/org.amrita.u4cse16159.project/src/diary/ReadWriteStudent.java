package diary;

import student.academics.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class ReadWriteStudent {

    private ArrayList<Student> studentList;

    public ReadWriteStudent(){
        studentList = new ArrayList<>();
    }

    public  void addToStudentList(Student student) {
        studentList.add(student);
    }

    public Student getStudent(int index){
        return studentList.get(index);
    }

    public ArrayList<Student> getStudentList() {
        Collections.sort(studentList);
        return studentList;
    }

    public void writeToFile() throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("data/studentList"));
        oos.writeObject(getStudentList());
    }

    public void writeToFile(ArrayList<Student> studentList) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("data/studentList"));
        oos.writeObject(studentList);
    }

    public ArrayList<Student> readFromFile() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("data/studentList"));
        ArrayList<Student> studentList = (ArrayList<Student>) ois.readObject();
        return studentList;
    }
}
