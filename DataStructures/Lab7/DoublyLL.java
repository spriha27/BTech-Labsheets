public class DoublyLL {
	public DLLNode head = null;

	public void insert_At_Head(int value){
		DLLNode newnode=new DLLNode(value);
		if( head==null){ 
			head=newnode;
		}
		else{
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
	}
	public void print(){
		if(head==null){
			System.out.println("Empty List");
		}
		else{
			DLLNode temp=head;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public void insert_At_Tail(int value){
		DLLNode newnode=new DLLNode(value);
		if( head==null){
			head=newnode;
		}
		else{
			DLLNode temp = head;
			while(temp.next != null){
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
		}
	}
	public void insert_At_Position(int value, int k)  {
		int c=0;
		DLLNode newnode = new DLLNode(value);
		DLLNode temp = head;
		while((temp!=null)&&(c<k-1)){
			c++;
			temp=temp.next;
		}
		temp.next.prev=newnode;
		newnode.next = temp.next;
		newnode.prev=temp;
		temp.next = newnode;
	}
	public void insert_after_Node(int value, int node_data){
		DLLNode newnode=new DLLNode(value);
		DLLNode temp = head;
		while(temp.data != node_data){
			temp=temp.next;
		}
		temp.next.prev=newnode;
		newnode.next = temp.next;
		newnode.prev=temp;
		temp.next = newnode;
	}
	public void deleteAtValue(int val){
		DLLNode temp = head;
		DLLNode deleted;
		while(temp.next.next!=null){
			if(temp.next.data == val){
				deleted=temp.next;
				temp.next.next.prev=temp;
				temp.next=temp.next.next;
				deleted.next=null;
			}
			else
				temp=temp.next;
		}
	}
	public void reverseDLL(){
		DLLNode temp=head;
		DLLNode temp1=head.next;
		DLLNode temp2=head.next.next;
		head.prev = temp1;
		head.next = null;
		while(temp1.next != null){
			temp1.next = temp;
			temp1.prev = temp2;
			temp = temp1;
			temp1 = temp2;
			temp2 = temp2.next;
		}
		temp1.next = temp;
		temp1.prev = temp2;
		head = temp1;
	}
}