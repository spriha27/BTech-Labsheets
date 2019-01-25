/*
            File Name: Mile.java
            Roll Number: u4cse16159
            Name: Spriha
            Submitted on: 12/07/2017
*/
import java.util.Scanner;
class Mile{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		double distInMiles=0.0,distInKms,time,avgTime,avgSpeed;
		distInKms= s.nextInt();
		time= s.nextInt();
		distInMiles=distInMiles/1.61;
		avgTime=time/distInMiles;
		avgSpeed=distInKms/time;
		System.out.println("Average time is " + avgTime + " and average speed is " + avgSpeed);
	}
}
