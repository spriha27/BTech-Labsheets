import java.io.*;
import java.util.*;
public class SerializeStudent{
  public static void main(String[] args) {
    String filename = "std.ser";
    ArrayList<Course> c1 = new ArrayList<Course>();
    ArrayList<Course> c2 = new ArrayList<Course>();
    c1.add(new Course(4,"OOPS"));
	c1.add(new Course(3,"Math"));
	c1.add(new Course(4,"DataStructures"));
	c2.add(new Course(4,"ECE"));
	c2.add(new Course(3,"English"));
	c2.add(new Course(3,"EEE"));
    //Student Satwik = new Student("Satwik Santhi",137);
    Student[] s = {new Student("Surya",47,c1),new Student("Sharu",24,c2)};
    try{
      /*ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename));
      os.writeObject(Satwik);
      os.close();*/
      ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename));
      for(int i=0;i<s.length;i++){
        os.writeObject(s);
      }
      ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
      Student[] p = (Student[])is.readObject();
      for(int i=0;i<p.length;i++){
        System.out.println("Name:"+p[i].getName()+"Rollno:"+p[i].getRollNo()+"Course"+p[i].getCourses());
      }
    }
    catch(Exception e){
      e.printStackTrace ();
    }
  }
}

