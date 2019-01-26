public class BinarySearchTree {
	Node root=null;

	public void insert_Element(int x)
	{
		Node temp=new Node(x);
		int flag=1;
		if(root==null)
		{
			root=temp;
		}
		else
		{
			Node cur =root;
            Node parent =null;
            while(flag!=0)
            {
                    parent=cur;
                    if(x<cur.data)
                    {
                            cur=cur.left;
                            if(cur==null)
                            {
                                    parent.left=temp;
                                    flag=0;
                            }
                    }
                    else if(x>cur.data)
                    {
                            cur=cur.right;
                            if(cur==null)
                            {
                                    parent.right = temp;
                                    flag=0;
                            }
                    }
            }
		}
	}
	public void search_Element(Node root,int x)
	{	
		if(x==root.data)
			System.out.print("Element found : "+x);
		else if(x>root.data)
		{
			root=root.right;
			if(root==null)
				System.out.println("Element not found");
			else
				search_Element(root,x);
		}
		else if(x<root.data)
		{
			root=root.left;
			if(root==null)
				System.out.println("Element not found");
			else
				search_Element(root,x);
		}
	}
	public void min_Element()
	{
		Node temp=root;
		while(temp.left!=null)
			temp=temp.left;
		System.out.println("Minimum : "+temp.data);
	}
	public void max_Element()
	{
		Node temp=root;
		while(temp.right!=null)
			temp=temp.right;
		System.out.println("Maximum : "+temp.data);
	} 
	public void in_Order(Node root)
	{
		if(root!=null)
        {
                in_Order(root.left);
                System.out.print(root.data+" ");
                in_Order(root.right);
        }
	}
	public void pre_Order(Node root)
	{

        if(root!=null)
        {
                System.out.print(root.data+" ");
                pre_Order(root.left);
                pre_Order(root.right);
        }
	}
	public void post_Order(Node root)
	{
		if(root!=null)
		{
			post_Order(root.left);
			post_Order(root.right);
			System.out.print(root.data+" ");
		}
	}
	public void delete(int x)
	{
		int flag=1;
		Node temp=root;
		Node n=temp;
		while(flag!=0)
		{
			if(temp.data==x)
			{
				flag=0;
				break;
			}
			n=temp;
			if(x<temp.data)
				temp=temp.left;
			else
				temp=temp.right;
		}
		if(temp.left == null && temp.right==null)
			if(n.left == temp)
				n.left=null;
			else
				n.right = null;
		else if(temp.left==null || temp.right==null)
		{
			if(n.left.data==x)
			{
				if(temp.left==null)
					n.left=temp.right;
				else
					n.left=temp.left;
			}
			else
			{
				if(temp.left==null)
					n.right=temp.right;
				else
					n.right=temp.left;
			}
		}
		else
		{
			Node temp1=temp.right;
			Node p =temp1;
			while(temp1.left!=null)
			{
				p=temp1;
				temp1=temp1.left;
			}
			if(n.right.data==x)
				n.right.data=temp1.data;
			else if(n.left.data==x )
				n.left.data=temp1.data;
			else if(n.data==x)
				n.data=temp1.data;
			if(temp1.right!=null)
					p.left=temp1.right;
			else if(temp1==p)
				temp.right=null;
			else
				p.left=null;
		}
		
	}
}