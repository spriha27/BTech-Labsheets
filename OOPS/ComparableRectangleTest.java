import java.io.*;
//import java.lang.Object;
//import java.lang.Comparable;
//import java.util.Comparator;

public class ComparableRectangleTest{
	
	public static void main (String args[]) {
		
		ComparableRectangle[] rectangles = {
			new ComparableRectangle(1.5,3.4),
			new ComparableRectangle(2.5,8.3),
			new ComparableRectangle(3.6,4.8),
			new ComparableRectangle(10.8,4.5),
		};
	
		java.util.Arrays.sort(rectangles);
		for(ComparableRectangle c : rectangles){
			System.out.println(c);
		}
	}
}

