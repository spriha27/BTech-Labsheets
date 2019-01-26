public class SinglyLL{
	public Node head;
	
	SinglyLL(){
		//default constructor
	}
	
	SinglyLL(Node head){
		this.head = head;
	}
	
	public void insertAtHead(Node newnode){
		if(head == null){
			head = newnode;
		}
		else{
			newnode.next = head;	
			head = newnode;
		}
	}
	public void insertAtLast(Node newnode){
		if(head == null){
			head = newnode;
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}
	public void insertAtPosition(Node newnode, int position){
		if(position == 1){
			insertAtHead(newnode);
		}
		else{
			Node temp = head;
			int count = 1;
			while((count+1) != position){
				temp = temp.next;
				count++;
			}
			newnode.next = temp.next;
			temp.next = newnode;
		}		
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
		if(head==null)
			System.out.println("Empty list. Can't remove head");
		else if(head.next == null)
			head = null;
		else
			head = head.next;
	}
	public void deleteAtTail(){
		if(head==null){
			System.out.println("Empty list. Can't remove tail");
		}
		else if(head.next == null)
			head = null;
		else{
			Node temp = head;
			while(temp.next.next!= null){
				temp = temp.next;
			}
			temp.next = null;
			System.out.println(temp.next);
		}
	}
	public void deleteAtPosition(int position){
		if(position == 1){
			deleteAtHead();
		}
		else{
			Node temp = head;
			int count = 1;
			while((count+1) != position){
				temp = temp.next;
				count++;
			}
			temp.next = temp.next.next;
		}
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
		if(head == null)
			System.out.println("Empty list");
		else{
			Node temp = head;
			while(temp.next != null){
				System.out.println(temp.data);
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
	public void reverseSLL(){
		Node temp, temp1, temp2;
		temp = head;
		temp1 = head.next;
		temp2 = head.next.next;
		while(temp1.next != null){
			System.out.println("f");
			temp1.next = temp;
			temp = temp1;
			temp1 = temp2;
			temp2 = temp2.next;
		}
		head.next = null;
		temp1.next = temp;
		head = temp1;
		display();
	}
	public void sort(){
		int tempo;
		Node temp, temp1;
		temp = head;
		temp1 = head.next;
		while(temp.next != null){
			while(temp1 != null){
				if(temp1.data <= temp.data){
					tempo = temp1.data;
					temp1.data = temp.data;
					temp.data = tempo;
				}
				temp1 = temp1.next;
			}
			temp1 = temp.next.next;
			temp = temp.next;
		}
		System.out.println("the sorted order is: ");
		display();
	}		
}