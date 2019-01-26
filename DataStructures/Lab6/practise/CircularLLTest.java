public class CircularLLTest{
	public static void main(String args[]){
		CircularSLL cll1 = new CircularSLL();
		cll1.insertAtHead(new Node(40));
		cll1.insertAtHead(new Node(30));
		cll1.insertAtHead(new Node(20));
		cll1.insertAtHead(new Node(10));
		cll1.insertAtLast(new Node(50));
		cll1.insertAtLast(new Node(60));
		cll1.insertAtLast(new Node(70));
		cll1.insertAtLast(new Node(80));
		cll1.insertAtPosition(new Node(100),3);
		cll1.insertBeforeNode(new Node(50),10);
		cll1.insertBeforeNode(new Node(50),30);
		cll1.insertAfterNode(new Node(50),80);
		cll1.display();
		System.out.println("Deletion begins here: ");
		cll1.deleteAtTail();
		cll1.deleteAtTail();
		cll1.deleteAtHead();
		cll1.deleteAtHead();
		cll1.deleteAtPosition(5);
		cll1.deleteBeforeNode(30);
		cll1.deleteAfterNode(30);
		cll1.display();
	}
}	