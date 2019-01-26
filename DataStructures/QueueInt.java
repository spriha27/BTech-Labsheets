public class QueueInt{
	int[] arr;
	int front=-1, rear =-1;

	QueueInt(){
		arr = new int[10];
		front = -1;
		rear = -1;
	}

	QueueInt(int n){
		arr = new int[n];
		front = -1;
		rear = -1;
	}

	public void enqueue(int s){
		if(front == -1 && rear == -1){
			front++; rear++;
			arr[rear] = s;
		}
		else if(rear < arr.length){
			arr[rear] = s;
		}
		else
			System.out.println("Queue is full. Can't enqueue.");
	}

	public void dequeue(){
		if(front == -1 && rear == -1){
			System.out.println("Queue is empty. Can't dequeue.");
		}
		else if(front != rear){
			front++;
		}
		else{
			front=-1;
			rear=-1;
		}
			
	}
	public int getFront(){
		return arr[front];
	}

	public void printQ(){
		for(int i = front; i<=rear; i++){
			System.out.println(arr[i]);
		}
	}
	public boolean IsEmpty(){
		if(front==-1 && rear == -1){
			return true;
		}
		else return false;
	}
}