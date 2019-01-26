import java.util.*;
import java.io.*;

public class Customer implements Serializable{
	public static int customerId;
	public static String customerName;
	public static int customerAge;

	Customer(int customerId, String customerName, int customerAge){
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.customerId = customerId;
	}

	public String toString(){
		return "Customer Id: "+ customerId + " Customer name: "+ customerName + " Customer Age: "+ customerAge;
	}

	public static void main(String args[]){
		ArrayList<Customer> cl = new ArrayList<Customer>();
		cl.add(new Customer(1001,"Spriha",19));
		cl.add(new Customer(1002,"Siddharth",18));
		cl.add(new Customer(1003,"Aruna",17));

		try{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customer.ser"));
			for(Customer c : cl){
				System.out.println(c);
				oos.writeObject(c);
			}
			oos.close();
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customer.ser"));
			Customer c ;
			for(int i=0; i<3;i++){
				c = (Customer)ois.readObject();
				System.out.println(c.toString());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}