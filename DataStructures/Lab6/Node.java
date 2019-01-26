//package LinkedLists;

public class Node {
	public Node next;
	public int data;

	public Node(){
		data = 0;
		next = null;
	}

	public  Node(int x) {
		data=x;
		next=null;
                                              }
	public Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
}
