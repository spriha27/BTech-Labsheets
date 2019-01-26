public class Point{
	private int x;
	private int y;
	Point()
	{
		x=y=0;
	}
	Point(int p, int q)
	{
		x=p;
		y=q;
	}
	
	public void setX(int d)
	{
		x=d;
	}

	public void setY(int d)
	{
		y=d;
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	
	public int[] getXY()
	{
		int arr[]=new int[2];
		arr[0]=x;
		arr[1]=y;
		return arr;
	}
	public void setXY(int a, int b)
	{
		x=a;
		y=b;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}
}

