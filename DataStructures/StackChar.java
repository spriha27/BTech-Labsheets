//package Stacks;
import java.lang.Object;
import java.io.*;

public class StackChar{
	public char arr[] = new char[10];
	int top = -1;
	
	public StackChar(){
		arr = new char[15];
		top = -1;
	}
	public StackChar(int sz) {
		arr = new char[sz];
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
	public void push(char e){
		if(!IsFull()){
			top++;
			arr[top]=e;
		}
		else{
			System.out.println("can't push.");
		}
	}
	public char getTop(){
			if(IsEmpty()){
				return 0;
			}
			else
				return arr[top];
	}
	
	public int peek(){
		if(IsEmpty()){
			return 0;
		}
		else
			return arr[top];
	}
	public boolean equals(StackChar s2){
		for(int i=0; i<=top;i++){
			if(arr[i]==s2.arr[i]){
				continue;
			}
			else
			return false;
			}
		return true;
	}
	
	public int getminElement(){
		char temp=0;
		for(int i=0; i<=top;i++){
			temp = arr[0];
			if(temp<arr[i]){
				temp=arr[i];
			}
		}
		return temp;
	}
	public char pop(){
		if(!IsEmpty()){
			char temp = arr[top];
			top--;
			return temp;
		}
		else
			System.out.println("can't pop.");
			return 0;
	}
	
	public StackChar copyStack(){
		StackChar s= new StackChar(arr.length);
		for(int i=0; i<=top;i++){
			s.arr[i]=arr[i];
		}
		return s;
	}
	public boolean parenthesisCheck(String s){
		int size = s.length();
		//System.out.println(size);
		for(int i=0;i<size;i++){
			if(s.charAt(i)=='(' || s.charAt(i) == '{' || s.charAt(i) == '['){
				push(s.charAt(i));
			}
			else{
				switch(s.charAt(i)){
					case '}':
						if(arr[top]=='{'){
							pop();
							break;
						}
						else
							return false;
					
					case ')':
						if(arr[top]=='('){
							pop();
							break;
						}
						else
							return false;
					
					case ']':
						if(arr[top]=='['){
							pop();
							break;
						}
						else
							return false;

				}
			}
		}
		if(IsEmpty())
			return true;
		else
			return false;
	}
	
	public int precedence(char ch){
			switch(ch){
					case '(':
							return 5;
					case '^':
							return 3;
					case '/':
							return 2;
					case '*':
							return 2;
					case '+':
							return 1;
					case '-':
							return 1;
			}
			return 0;
		}
	
	public String convert(String s){
		
		int size = s.length();
		String result="";
		for(int i=0;i<size;i++){
			if(Character.isLetterOrDigit(s.charAt(i))){
				result=result + Character.toString(s.charAt(i));
				//print();
				//System.out.println(" ");
			}
			
			else if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/' || s.charAt(i)=='^' ||s.charAt(i)=='('){
				while((!IsEmpty()) && (precedence(arr[top]) >= precedence(s.charAt(i))) && (arr[top] != '(')){
					char x = pop();
					result = result + Character.toString(x);
				}
				push(s.charAt(i));
				//print();
				//System.out.println(" ");
			}
			else
			{
				while(!IsEmpty() && (arr[top] != '(')){
					//result = result + Character.toString(arr[top]);
					char y = pop();
					result = result + Character.toString(y);
				}
				pop();
				//print();
				//System.out.println(" ");
				//result = result + Character.toString(z);
			}
		}
		while(!IsEmpty()){
					char y = pop();
					result = result + Character.toString(y);
				}
		return result;
	}
	
	public double operate(double x1, double x2, char x){
		switch(x){
			case '+':
			return x1 + x2;
			
			case '-':
			return x1 - x2;
			
			case '*':
			return x1 * x2;
			
			case '/':
			return x1 / x2;
		 }
		 return 0.0;
	}
	
	public char infixEvaluator(String s){
		String sr = convert(s);
		int size = sr.length();
		double result;
		for(int i=0;i<size;i++){
			if(Character.isLetterOrDigit(s.charAt(i))){
				push(s.charAt(i));
			}
			
			else if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/' || s.charAt(i)=='^'){
					char x = pop();
					char y = pop();
					double d1 = Double.valueOf(String.valueOf(x));
					double d2 = Double.valueOf(String.valueOf(y));
					//System.out.println(x+ " " + y);
					result = operate(d2,d1,s.charAt(i));
					String stri = Double.toString(result);
					push(stri.charAt(0));
			}
		}
		return getTop();
	}
}
