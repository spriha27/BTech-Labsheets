package Stacks;

public class StackInt {
	public int arr[] = new int[5];
	int top = -1;
	
	public StackInt(){
		arr = new int[15];
		top = -1;
	}
	public StackInt(int sz) {
		arr = new int[sz];
		top = -1;
	}
	public void print(){
		for(int i=0; i<=top;i++){
			System.out.println(arr[i]+"\t");
		}
	}
	public boolean IsFull(){
		if (top==arr.length-1){
			return true;
		}
		else return false;
	}
	public boolean IsEmpty(){
		if (top==-1){
			return true;
		}
		else return false;
	}
	public void push(int e){
		if(!IsFull()){
			top++;
			arr[top]=e;
		}
		else{
			System.out.println("can't push.");
		}
	}
	public int getTop(){
			if(IsEmpty()){
				return 0;
			}
			else
				return arr[top];
	}
	public void pop(){
		if(!IsEmpty()){
			int temp = arr[top];
			top--;
			System.out.println(temp);
		}
		else
			System.out.println("can't pop.");
	}
	public int peek(){
		if(IsEmpty()){
			return 0;
		}
		else
			return arr[top];
	}
	
}