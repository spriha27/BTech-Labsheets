//package LinkedLists;

public class TestLL {
        public static void main(String args[]){
        	SinglyLinkedList  ob1 = new SinglyLinkedList ();
        	SinglyLinkedList  ob2 = new SinglyLinkedList ();
        	ob1. insert_At_Head (90);
        	ob1. insert_At_Head (10);
        	ob1.print();
        	System.out.println();
        	ob2. insert_At_Tail (20);
        	ob2. insert_At_Tail (27);
        	ob2. insert_At_Tail (32);
        	ob2.print();
        	System.out.println();
        	ob2.insert_At_Tail(30,2);
        	ob2.print();
        	System.out.println();
        	ob2.deleteAtPosition(3);
        	ob2.print();
        	System.out.println();
        	ob2.deleteAtValue(27);
        	ob2.print();
        	System.out.println();
       }
}
