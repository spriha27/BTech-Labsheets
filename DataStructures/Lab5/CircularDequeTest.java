//package Queues;

public class CircularDequeTest {
	public static void main(String args[]){
		CircularDeque cd = new CircularDeque(5);
		cd.insertFront(10);
		cd.insertLast(20);
		cd.insertLast(25);
		cd.insertLast(35);
		cd.insertFront(40);
		// cd.deleteFront();
		// cd.deleteLast();
		// cd.getRear();
		// cd.getFront();
		cd.display();
	}
}
