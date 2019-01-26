import java.util.*;
public class BFS
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
		int v,e,x,y ;
		System.out.println("Enter the No. of vertices : ");
		v=in.nextInt();
    Vertex[] ver = new Vertex[v];
    for(int i=0;i<v;i++)
    {
      char c=(char)(97+i);
      ver[i] = new Vertex(c);
    }
		System.out.println("Enter the No. of edges : ");
		e=in.nextInt();
		int[][] a = new int[v][v] ;
		System.out.println("Enter edges : <to> <from> ");
		for(int i=0;i<e;i++)
		{
			x=in.nextInt();
			y=in.nextInt();
			a[x-1][y-1]=1;
      a[y-1][x-1]=1;
		}
    QueueInt q = new QueueInt();
	/*	System.out.println("Adjancency Matrix : ");
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}*/
    int i=0;
    System.out.println("Start with ");
    char z = in.next().charAt(0);
    for(int j=0;j<v;j++)
    {
      if(ver[j].getName()==z)
      {
        q.enqueue(0);
        ver[j].setValue(false);
        i=j;
      }
    }

    while(q.isEmpty()!=1)
		{
			for(int j=0;j<v;j++)
			{
        if(a[i][j]==1)
        {
          if(ver[j].getValue()==true)
          {
            q.enqueue(j);
            ver[j].setValue(false);
          }
        }
      }
			i=q.dequeue();
      System.out.print(ver[i].getName()+" ");
		}


  }
}
