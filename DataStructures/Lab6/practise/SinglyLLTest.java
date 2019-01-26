public class SinglyLLTest{
	public static void main(String args[]){
		SinglyLL cll1 = new SinglyLL();
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
		cll1.sort();
	}
}	