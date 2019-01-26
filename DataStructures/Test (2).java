package Stacks;

public class Test {
		public static void main(String args[]){
			StackInt si = new StackInt();
			StackInt sicopy = new StackInt();
			si.push(100);
			si.push(200);
			si.push(300);
			si.push(400);
			si.push(500);
			si.push(600);
			si.push(700);
			si.push(800);
			si.push(900);
			si.push(1000);
			si.push(1100);
			si.push(1200);
			si.print();
			System.out.println(si.getTop());
			si.pop();
			si.print();
			si.getminElement();
			sicopy=si.copyStack();
			sicopy.print();
	}
}
