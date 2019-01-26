public class CircularLL {
	public Node head = null;

	public void insert_At_Head(int value){
		Node newnode=new Node(value);
		if( head==null){ 
			head=newnode;
			head.next=head;
		}
		else{
			newnode.next=head;
			head.next=newnode;
			head=newnode;
		}
	}
	public void print(){
		if(head==null){
			System.out.println("Empty List");
		}
		else{
			Node temp=head;
			while(temp.next!=head){
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public void insert_At_Tail(int value){
		Node newnode=new Node(value);
		if( head==null){
			head=newnode;
			head.next=head;
		}
		else{
			Node temp = head;
			while(temp.next != head){
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.next=head;
		}
	}
	public void insert_At_Position(int value,int k)  {
		int c=0;
		Node newnode = new Node(value);
		Node temp = head;
		while((temp.next!=head)&&(c<k-1)){
			c++;
			temp=temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}
	public void deleteAtPosition(int k){
		Node deleted;
		Node temp = head;
		int c =0;
		while((temp.next!=head)&&(c<k-1)){
			c++;
			temp=temp.next;
		}
		deleted=temp.next;
		temp.next=temp.next.next;
		deleted.next=null;
	}
	
	public void deleteAtValue(int val){
		Node temp = head;
		Node deleted;
		while(temp.next.next!=head){
			if(temp.next.data == val){
				deleted=temp.next;
				temp.next=temp.next.next;
				deleted.next=null;
			}
			else
				temp=temp.next;
		}
	}
	public void concatenate(CircularLL s1){
		Node temp = head;
		while(temp.next!=head){
			temp=temp.next;
		}
		temp.next=s1.head;
		while(temp.next!=s1.head){
			temp=temp.next;
		}
		temp.next=head;
	}
}