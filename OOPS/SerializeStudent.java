import java.io.*;

public class SerializeStudent{
		
	public static void main (String args[]) {
		String filename ="Std.ser";
		Student[] s = {new Student("Phani",119), new Student("Ken",32), new Student("Aruna", 113)};
		try{
			/*Student phani = new Student("Phani Datta",119);
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename));
			os.writeObject(phani);
			os.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		try{
		ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
		Student p = (Student)is.readObject();
		System.out.println("Std name is : "+ p.getName() + " and Std Rollno. is: " + p.getRollNo());
			/*os.writeObject(phani);
			os.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename));
			for(Student item :s){
				System.out.println("Name: " + item.getName() + " and RollNo." + item.getRollNo());
			}
			for(int i=0;i<s.length;i++){
				os.writeObject(s[i]);
			}
		}*/
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename));
			os.writeObject(s);
			Student[] p = (Student[]) is.readObject();
			for(Student item :p){
				System.out.println("Name: " + item.getName() + " and RollNo." + item.getRollNo());
			}
		}

		catch(Exception e){
			e.printStackTrace();
		}
	}
}

