import java.util.*;
public class DFS
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
		int v,e,x,y ;
		System.out.println("Enter the No. of vertices : ");
		v=in.nextInt();
    int[][] a = new int[v][v] ;
    DFSVertex[] ver = new DFSVertex[v];
    for(int i=0;i<v;i++)
    {
      char c=(char)(97+i);
      ver[i] = new DFSVertex(c);
    }
		System.out.println("Enter the No. of edges : ");
		e=in.nextInt();
		System.out.println("Enter edges : <to> <from> ");
		for(int i=0;i<e;i++)
		{
			x=in.nextInt();
			y=in.nextInt();
			a[x-1][y-1]=1;
      a[y-1][x-1]=1;
		}
    StackInt q = new StackInt();
    int i=0;
    System.out.println("Start with ");
    char z = in.next().charAt(0);
    for(int j=0;j<v;j++)
    {
      if(ver[j].getName()==z)
      {
        q.push(j);
        ver[j].setColor("grey");
        i=j;
      }
    }
    int count=0;
    while(q.isEmpty()!=1)
		{
      count=0;
      i=q.peek();
			for(int j=0;j<v;j++)
			{
        if(a[i][j]==1)
        {
          if(ver[j].getColor()=="white")
          {
            count=1;
            q.push(j);
            ver[j].setColor("grey");
          }
        }
      }
      if(count==0)
      {
			   i=q.pop();
         System.out.print(ver[i].getName()+" ");
       }
		}
    System.out.println("");
  }
}