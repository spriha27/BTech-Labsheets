/*
            File Name: MyStatDriver.java
            Roll Number: u4cse16159
            Name: Spriha Mandal
            Submitted on: 3rd August 2017
*/

	import java.io.*;

	public class MyStatDriver{
	public static void main(String[] args){
		MyStat o = new MyStat();
		o.storeElements();
		double n=o.findMean();
		System.out.println(n);
		o.findMode();
		double v=o.findVariance();
		System.out.println(v);
		o.findMedian();
		o.findStandardDeviation();
	}
}
