//package LinkedLists;
	
	public class SinglyLinkedList{
	public Node head = null;

	public void insert_At_Head(int value){
		Node newnode=new Node(value);
		if( head==null){ 
			head=newnode;
		}
		else{
			newnode.next=head;
			head=newnode;
		}
	}
	public void print(){
		if(head==null){
			System.out.println("Empty List");
		}
		else{
			Node temp=head;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public void insert_At_Tail(int value){
		Node newnode=new Node(value);
		if( head==null){
			head=newnode;
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	public void insert_At_Tail(int value,int k)  {
		int c =0;
		Node newnode = new Node(value);
		Node temp = head;
		while((temp.next!=null)&&(c<k-1)){
			c++;
			temp=temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}
	public void deleteAtPosition(int k){
		Node temp = head;
		int c =0;
		while((temp.next!=null)&&(c<k-1)){
			c++;
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	
	public void deleteAtValue(int val){
		Node temp = head;
		Node deleted;
		while(temp.next.next!=null){
			if(temp.next.data == val){
				deleted=temp.next;
				temp.next=temp.next.next;
				deleted.next=null;
			}
			else
				temp=temp.next;
		}
	}
	public int countNodes(){
		int c=0;
		Node temp = head;
		while(temp.next!=null){
			c++;
			temp=temp.next;
		}
		return c;
	}
	public int sumNodes(){
		int sum=0;
		Node temp = head;
		while(temp.next!=null){
			sum=sum+temp.data;
			temp=temp.next;
		}
		return sum;
	}
	public void changeAtValue(int val, int newval){
		Node temp = head;
		while(temp.next!=null){
			if(temp.data == val)
				temp.data=newval;
			else
				temp=temp.next;
		}
	}
	public int LargestNode(){
		Node temp = head;
		int c=temp.data;
		while(temp.next!=null){
			if(temp.data < c)
				c=temp.data;
		}
		return c;
	}
	
	public void searchNode(Node p){
		int flag =0;
		Node temp = head;
		while(temp.next!=null){
			temp=temp.next;
			if(temp==p){
				System.out.println("element found");
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("element not found");
		}
	}
	public void concatenate(SinglyLinkedList s1){
		Node temp = head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=s1.head.next;
	}
	public void deleteEvenNodes(){
		Node temp=head;
		while(temp.next!=null){
			deleteAtValue(temp.data);
			temp=temp.next.next;
		}
	}
	public void reverseSLL(){
		Node temp=head;
		Node temp2=temp.next;
		Node temp3=temp2.next;
		while(temp3.next!=null){
			temp2.next=temp;
			temp=temp2;
			temp2=temp3;
			temp3=temp2.next;
		}
		temp2=temp3;
		temp=temp2;
		temp2.next=temp;
		temp2=head;
	}
	public void splitList(){
		Node temp=head;
		Node temp2=temp.next;
		while(temp2.next!=null||temp.next!=null){
			temp.next.next=temp.next;
			temp2.next.next=temp2.next;
		}
	}	
}

