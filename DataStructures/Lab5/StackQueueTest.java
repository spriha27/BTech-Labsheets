package StackQueue;

public class StackQueueTest {
	public static void main(String[] args) {
		StackQueue p1 = new StackQueue();
		p1.QueuePush(100);
		p1.QueuePush(200);
		p1.QueuePush(300);
		p1.QueuePrint();
		p1.QueuePop();
		p1.QueuePrint();
	}

}
