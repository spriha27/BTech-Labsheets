//package LinkedLists

public class QueueLL{
	public SinglyLinkedList s;
	
	public void push(int value){
		s.insert_At_Tail(value);
	}
	
	public void pop(){
		Node temp=s.head.next;
		s.deleteAtValue(s.head.data);
		s.head=temp;
	}
	
	public void print(){
		s.print();
	}
	public int peak(){
		return s.head.data;
	}
}

