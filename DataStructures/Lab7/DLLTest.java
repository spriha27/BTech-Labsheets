public class DLLTest {
	public static void main(String args[]){
    	DoublyLL ob1 = new DoublyLL();
    	ob1. insert_At_Head (40);
    	ob1. insert_At_Head (10);
    	ob1. insert_At_Head (69);
    	ob1. insert_At_Tail (20);
    	ob1. insert_At_Tail (27);
    	ob1. insert_At_Tail (32);
    	ob1. insert_At_Head (54);
    	ob1. insert_At_Head (29);
    	ob1.print();
    	System.out.println();
    	ob1.insert_after_Node(279, 40);
    	ob1.print();
    	System.out.println();
    	// ob1.deleteAtValue(10);
    	// ob1.print();
    	// System.out.println();
    	ob1.reverseDLL();
    	ob1.print();
    	System.out.println();
   }
}