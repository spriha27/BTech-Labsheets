import java.io.*;

public class ComparableRectangle implements Comparable<ComparableRectangle>{
	
	private double length;
	private double breadth;
	
	public ComparableRectangle(double l, double b){
		length=l;
		breadth=b;
	}
	
	public double getArea(){
		return length*breadth;
	}
	
		public int compareTo(ComparableRectangle r){
			if(this.getArea() == r.getArea())
			return 0;
			else if(this.getArea() > r.getArea())
			return -1;
			else return 1;
		}
		public String toString(){
			return "Area: " + getArea();
		}
		
}

