class QueueInt
{
	int front =-1,rear=-1;
	int[] a = new int[5];
	QueueInt()
	{
		a=new int[10];
		front=-1;
		rear=-1;
	}
	QueueInt(int n)
	{
		a = new int[n];
		front=-1;
		rear=-1;
	}
	public void print()
	{
		if((front==-1) && (rear==-1))
			System.out.println("Queue is empty");
		for(int i=front;i<=rear;i++)
			System.out.print(a[i]+" ");
	}
	public int isEmpty()
	{
		if(rear==-1 && front == -1)
			return 1;
		else
			return 0;
	}
	public void enqueue(int x)
	{
		if(rear==(a.length-1))
			System.out.println("Can't Enqueue ");
		else
		{
			if((front==-1) && (rear==-1))
			{
				front=0;
				rear=0;
			}
			else
				rear=rear+1;
			a[rear]=x;
		}
	}
	public int getFront()
	{
		if(front==-1)
		{
			System.out.println("Queue is Empty");
			return 0;
		}
		else
			return a[front];
	}
	public int dequeue()
	{
		if(rear==front)
		{
			int x=a[front];
			front=-1;
			rear=-1;
			return x;
		}
		else
		{
			if((front==-1)&&(rear==-1))
				return -1;
			else
			{
				front=front+1;
				return a[front-1];
			}
		}
	}
	public boolean equals(QueueInt x)
	{
		int flag=1;
		if((this.front==x.front) && (this.rear==x.rear))
		{
			for(int i=front;i<=rear;i++)
			{
				if(this.a[i]!=x.a[i])
					flag=0;

			}
			if(flag==0)
				return false;
			else
			{
				return true;
			}
		}
		else
			return false;
	}

}