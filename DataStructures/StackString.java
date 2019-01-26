package Stacks;

public class StackString{
	public char arr[] = new char[100];
	int top = -1;
	
	public StackString(String s){
		for(int i=0;i<s.length();i++){
			arr[i] = s.charAt(i);
			top++;
			//System.out.println(arr[i]);
		}
	}
	
	public void pop(){
		System.out.print((char)arr[top]);
	}
	
	public void print(){
		while(top!=-1){
			//System.out.println(top);
			pop();
			top--;
		}
	}
}
