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
				System.out.println(“Empty list”);
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
				Node t = head;
				while(t.next != null){
					t=t.next;
				}
				t.next=newnode;
			}
		}


}
