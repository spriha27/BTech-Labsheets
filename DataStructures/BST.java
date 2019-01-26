public class BST{
	public TreeNode root;
	public int noOfNodes;

	BST(int n){
		root = null;
		noOfNodes=n;
	}

	public void insertNode(int a){
		TreeNode newnode = new TreeNode(a);
		if(root == null){
			root = newnode;
		}
		else{
			TreeNode temp = root;
			while(temp!=null){
				if(newnode.data < temp.data){
				temp=temp.left;
				System.out.println("left");
				}
				else if(newnode.data > temp.data){
					temp=temp.right;
					System.out.println("right");
				}
			}
			temp=newnode;
		}
	}

	public void preorder(TreeNode v){
		if(v==null)
			return;
		else{
			System.out.println(v.data);
			preorder(v.left);
			preorder(v.right);
		}
	}
}