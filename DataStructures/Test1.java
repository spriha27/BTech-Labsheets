package Stacks;

public class Test1{
	public static void main(String args[]){
	StackInt si1 = new StackInt(5);
	StackInt si2 = new StackInt(5);
	si1.push(100);
	si2.push(100);
	si1.push(200);
	si2.push(200);
	if(si1.equals(si2))
       System.out.println("Both si1 and si2 are same.");
	else
		System.out.println("Both si1 and si2 are not the same.");
	}
}
