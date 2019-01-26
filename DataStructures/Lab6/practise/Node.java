public class Node{
	public Node next;
	public int data;
	
	Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
	Node(int d){
		data = d;
		next = null;
	}
	Node(){
		data = 0;
		next = null;
	}
}
