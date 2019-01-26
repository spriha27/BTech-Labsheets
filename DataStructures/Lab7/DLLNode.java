public class DLLNode {
	public DLLNode next;
	public DLLNode prev;
	public int data;

	public DLLNode(){
		data = 0;
		next = null;
		prev=null;
	}

	public  DLLNode(int x) {
		data=x;
		next=null;
		prev=null;
                                              }
	public DLLNode(int data, DLLNode next, DLLNode prev){
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
}