package Stacks;

public class StackQueueTest {
	public static void main(String[] args) {
		StackQueue p1 = new StackQueue();
		p1.push(100);
		p1.push(200);
		p1.push(300);
		p1.print();
		p1.pop();
		p1.print();
	}
}
