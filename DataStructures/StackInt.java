public class StackInt{
	int top;
	int[] arr;

	StackInt(){
		top=-1;
		arr = new int[10];
	}

	public boolean isEmpty(){
		if(top==-1){
			return true;
		}
		else return false;
	}

	public boolean isFull(){
		if(top == arr.length)
			return true;
		else return false;
	}

	public void push(int a){
		if(isFull()){
			System.out.println("Can't push. Stack is full.");
		}
		else{
			top++;
			arr[top]=a;
		}
	}

	public void pop(){
		if(isEmpty()){
			System.out.println("Can't pop. Stack is Empty.");
		}
		else{
			top--;
		}
	}

	public int getTop(){
		return arr[top];
	}
}