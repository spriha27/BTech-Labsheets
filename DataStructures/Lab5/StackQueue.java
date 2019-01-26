package StackQueue;

public class StackQueue {
	StackInt s1 = new StackInt();
	StackInt s2 = new StackInt();
	public void QueuePush(int x){
		while(s1.getTop()!=-1){
			s2.push(s1.pop());
		}
		s2.push(x);
		while(s2.getTop()!=-1){
			s1.push(s2.pop());
		}
	}
	public int QueuePop(){
		return s1.pop();
	}
	int[] arr1 = s1.getArr();
	public void QueuePrint(){
		for(int i=s1.getTop();i>=0;i--){
			System.out.print(arr1[i]+"		");
		}
		System.out.println();
	}
}
