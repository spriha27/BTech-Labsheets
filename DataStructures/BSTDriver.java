import java.util.Scanner;

public class BSTDriver{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int nodes,data;
		System.out.println("Enter the no. of nodes:");
		nodes = s.nextInt();
		BST bst = new BST(nodes);
		for(int i=1; i<=nodes; i++){
			System.out.println("Enter node data:");
			data = s.nextInt();
			bst.insertNode(data);
		}
		bst.preorder(bst.root);
	}
}