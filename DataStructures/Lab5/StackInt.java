package StackQueue;
import java.util.Scanner;
public class StackInt {
	private int[] arr = new int[5];
	private int top=-1; 
	Scanner in = new Scanner(System.in);
	public StackInt()
	{
		arr =new int[10];
		top = -1;
	}
	public StackInt(int sz)
	{
		arr = new int[sz];
		top= -1;
	}
	public int getTop()
	{
		return top;
	}
	public int[] getArr()
	{
		return arr;
	}
	public void readArr(int n)
	{
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			top++;
		}
	}
	public void printArr()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(arr[i]+"		");
		}
		System.out.println();
	}
	public void push(int x)
	{
		if(top>=(arr.length-1))
			System.out.println("Stack is Full");
		else
		{
			top++;
			arr[top]=x;
		}
	}
	public int pop()
	{
		if(top==(-1))
		{
			System.out.println("Can't pop. Stack is empty");
			return 0;
		}
		else
		{
			return arr[top--];
		}
	}
	public int peek()
	{
		if(top==-1)
		{
			System.out.println("Can't peek");
			return 0;
		}
		else
			return arr[top];
	}
	public boolean equals(StackInt a)
	{
		int flag=1;
		if(this.top==a.top)
		{
			for(int i=0;i<=top;i++)
			{
				if(this.arr[i]!=a.arr[i])
					flag=0;
				
			}
			if(flag==0)
				return false;
			else
			{
				return true;
			}
		}
		else
			return false;
	}
	public int getm()
	{
		int m=arr[0];
		for(int i=0;i<=top;i++)
		{
			if(arr[i]<m)
				m=arr[i];
		}
		return m;
	}
	public StackInt copy()
	{
		StackInt a= new StackInt();
		a.top=this.top;
		for(int i=0;i<=top;i++)
		{
			a.arr[i]=this.arr[i];
		}
		return a;
	}
}
