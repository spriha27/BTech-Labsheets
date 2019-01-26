	package Queues;

public class QueueInt {
	int[] arr = new int[5];
	int front = -1;
	int rear = -1;
	
	QueueInt() {
		arr = new int[10];
		front = -1;
		rear=-1;
		}
	QueueInt(int size) {
		arr = new int[size];
		front = -1;
		rear=-1;
	}
	
	public void print() {
		for(int i=front; i<=rear;i++){
			System.out.println(arr[i]+"\t");
		}
	}
	
	public boolean IsFull(){
		if (rear==arr.length-1){
			return true;
		}
		else return false;
	}
	
	public boolean IsEmpty(){
		if (rear==-1 && front == -1){
			return true;
		}
		else return false;
	}
	
	public void enqueue(int item) {
		if(IsEmpty()){
			front++;
			rear++;
			arr[rear]=item;
		}
		else if(!IsFull()){
			rear++;
			arr[rear]=item;
		}
		else{
			System.out.println("Can't enqueue");
		}
	}
	
	public int getFront() {
		return  arr[front];
	}
	
	public void dequeue() {
		if(front!=rear && !IsEmpty()){
			int temp = arr[front];
			front++;
			System.out.println(temp);
		}
		else if( front == rear && !IsEmpty()){
			int temp = arr[front];
			front = -1;
			rear = -1;
			System.out.println(temp);
		}
		else
			System.out.println("Can't dequeue.");
	}
	
	public boolean equals(QueueInt another) {
		for(int i=front; i<=rear;i++){
			if(arr[i]==another.arr[i]){
				continue;
			}
			else
			return false;
			}
		return true;
		}
}
