//package LinkedLists;

public class StackLL{
	public SinglyLinkedList s;
	
	public void push(int value){
		s.insert_At_Head(value);
	}
	
	public void pop(){
		Node temp = s.head;
		while(temp.next!=null){
			temp=temp.next;
		}
		s.deleteAtValue(temp.data);
	}
	
	public void print(){
		s.print();
	}
	public int peak(){
		return s.head.data;
	}
}

