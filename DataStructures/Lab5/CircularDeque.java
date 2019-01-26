//package Queues;

public class CircularDeque {
	int[] arr = new int[5];
	int front = -1;
	int rear = -1;
	
	CircularDeque() {
		arr = new int[10];
		front = -1;
		rear=-1;
		}
	CircularDeque(int size) {
		arr = new int[size];
		front = -1;
		rear=-1;
	}
	
	public void display(){
		int i = front;
		do{
			i=i%arr.length;
			System.out.println(arr[i]+"\t");
			i++;
		}
		while((i-1)%arr.length != rear);
	}

	public boolean IsFull(){
		if (front == (rear+1)%arr.length) {
			return true;
		}
		else return false;
	}
	
	public boolean IsEmpty(){
		if (front == -1 && rear == -1){
			return true;
		}
		else return false;
	}
	
	public void insertFront(int item) {
		if(IsEmpty()){
			rear++;
			front++;
			arr[front]=item;
		}
		else if(IsFull()){
			System.out.println("Can't insert");
		}
		else{
			if(front-1 == -1){
				front=arr.length-1;
				arr[front]=item;
			}
			else{
				front--;
				arr[front]=item;
			}
		}
	}
	public void insertLast(int item) {
		if(IsEmpty()){
			front++;
			rear++;
			arr[rear]=item;
		}
		else if(IsFull()){
			System.out.println("Can't insert");
		}
		else{
			rear=(rear+1) % arr.length;
			arr[rear]=item;
		}
	}
	public int getFront() {
		return  arr[front];
	}
	public int getRear() {
		return  arr[rear];
	}
	public void deleteFront() {
		if(front==rear){
			front = -1;
			rear = -1;
		}
		else if(IsEmpty())
			System.out.println("Can't delete");
		else
			front = (front+1)% arr.length;
	}
	public void deleteLast() {		
		if(front==rear){
			front = -1;
			rear = -1;
		}
		else if(IsEmpty())
			System.out.println("Can't delete");
		else{
			rear--;
			if(rear == -1)
			rear = arr.length-1;
		}
	}

}
