public class CircularSLL{
	public Node head;
	
	CircularSLL(){
		//default constructor
	}
	
	CircularSLL(Node head){
		this.head = head;
	}
	
	public void insertAtHead(Node newnode){
		if(head == null){
			head = newnode;
			newnode.next = head;
		}
		else{
			Node temp = head;
			while(temp.next != head){
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.next = head;	
			head = newnode;
		}
	}
	public void insertAtLast(Node newnode){
		if(head == null){
			head = newnode;
			newnode.next = head;
		}
		else{
			Node temp = head;
			while(temp.next != head){
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.next = head;
		}
	}
	public void insertAtPosition(Node newnode, int position){
		Node temp = head;
		int count = 1;
		while((count+1) != position){
			temp = temp.next;
			count++;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}
	public void insertBeforeNode(Node newnode, int nodeReference){
		if(head.data == nodeReference){
			insertAtHead(newnode);
		}
		else{
			Node temp = head;
			while(temp.next.data != nodeReference){
					temp = temp.next;
			}
			newnode.next = temp.next;
			temp.next = newnode;
		}
	}
	public void insertAfterNode(Node newnode, int nodeReference){
		Node temp = head;
		while(temp.data != nodeReference){
				temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}
	public void deleteAtHead(){
		if(head==null){
			System.out.println("Empty list. Can't remove head");
		}
		else{
			Node temp = head;
			while(temp.next != head){
				temp = temp.next;
			}
			temp.next = head.next;
			head = temp.next;
		}
	}
	public void deleteAtTail(){
		if(head==null){
			System.out.println("Empty list. Can't remove tail");
		}
		else{
			Node temp = head;
			while(temp.next.next!= head){
				temp = temp.next;
			}
			temp.next = head;
		}
	}
	public void deleteAtPosition(int position){
		Node temp = head;
		int count = 1;
		while((count+1) != position){
			temp = temp.next;
			count++;
		}
		temp.next = temp.next.next;
		
	}
	public void deleteBeforeNode(int nodeReference){
		Node temp = head;
		while(temp.next.next.data != nodeReference){
				temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	public void deleteAfterNode(int nodeReference){
		Node temp = head;
		while(temp.data != nodeReference){
				temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	public void display(){
		Node temp = head;
		while(temp.next != head){
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}		
}
		
		
		