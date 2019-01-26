package Stacks;

public class StackQueue{
	
	public StackQueue(){
		StackInt s1 = new StackInt();
		StackInt s2 = new StackInt();
		StackInt s3 = new StackInt();
	}
	public StackQueue(int sz) {
		StackInt s1 = new StackInt(sz);
		StackInt s2 = new StackInt(sz);
		StackInt s3 = new StackInt(sz);
	}
	public void print(){
		if(s2.IsFull()){
			s2.print();
		}
		else s3.print();
	}
	public boolean IsFull(){
		if (s2.IsFull() || s3.IsFull()){
			return true;
		}
		else return false;
	}
	public boolean IsEmpty(){
		if (s2.top==-1 && s3.top==-1){
			return true;
		}
		else return false;
	}
	public void push(int e){
		if(!IsFull()&&s2.IsEmpty()){
			s3.push(e);
			while(!s3.IsEmpty()){
				s1.push(s3.pop());
			}
			while(!s1.IsEmpty()){
				s2.push(s1.pop());
			}
		}
		else if(!IsFull()&&s3.IsEmpty()){
			s2.push(e);
			while(!s2.IsEmpty()){
				s1.push(s2.pop());
			}
			while(!s1.IsEmpty()){
				s3.push(s1.pop());
			}
		}
		else{
			System.out.println("can't push.");
		}
	}
	public void pop(){
		if(!IsEmpty()&&s2.empty()){
			s3.pop();
		}
		else if(!IsEmpty()&&s3.empty()){
			s2.pop();
		}
		else
			System.out.println("can't pop.");
	}
	
}
