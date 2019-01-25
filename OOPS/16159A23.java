/*
            File Name: MyStat.java
            Roll Number: u4cse16159
            Name: Spriha Mandal
            Submitted on: 3rd August 2017
*/

	import java.util.Scanner;
	import java.io.*;
	public class MyStat{
	int p;
	Scanner s=new Scanner(System.in);
	int n = s.nextInt();	
	int[] a= new int[n];

	public void storeElements(){
		for(int i=0; i<n; i++){
			a[i]=s.nextInt();
		}
	}

	public double findMean(){
		double sum=0;
		for(int i=0; i<n; i++){
				sum += a[i]; 
		}
		return sum/n;
	}
	
	public void findMode(){
		int mode=0;
		int count=0;
		for(int i=0; i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count>mode){
				mode=count;
			}
		}
		System.out.println(mode);
	}
	public void findMedian(){
		int temp;
		for(int i=0; i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[(n/2)+1]);
	}
	public double findVariance(){
		double m = findMean();
		int sum =0;
		for(int i=0; i<n;i++){
			sum += Math.pow((a[i]-m),2);	
		}
		return sum;
	}
	public void findStandardDeviation(){
		double n= findVariance();
		System.out.println(Math.sqrt(n));
	}
}
