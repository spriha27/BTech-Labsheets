package Queues;

public class CircularQueue {
	int[] arr = new int[5];
	int front = -1;
	int rear = -1;
	
	CircularQueue() {
		arr = new int[10];
		front = -1;
		rear=-1;
		}
	CircularQueue(int size) {
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
		if (front == arr.length -1 && rear==arr.length-1){
			return true;
		}
		else return false;
	}
	
	public boolean IsEmpty(){
		if (front == (rear-1)%arr.length){
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
		else if(IsFull()){
			System.out.println("Can't dequeue");
		}
		else{
			rear= (rear+1) % arr.length;
			arr[rear]=item;
		}
	}
	
	public int getFront() {
		return  arr[front];
	}
	
	public void dequeue() {
		if(front==rear){
			front = -1;
			rear = -1;
		}
		else if(IsEmpty()){
			System.out.println("Can't dequeue");
		}
		else
			front = (front+1)% arr.length;
	}
	
	public boolean equals(CircularQueue another) {
		for(int i=front; i<=rear;i++){
			if(arr[i]==another.arr[i]){
				continue;
			}
			else
			return false;
			}
		return true;
	}
	
	public int getMinElement(){
		int small=arr[front];
		for(int i=front+1; i<=rear;i++){
			if(arr[i]<small){
				small=arr[i];
			}
		}
		return small;
	}
}
