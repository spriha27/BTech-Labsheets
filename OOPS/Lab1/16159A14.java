/*
            File Name: Amicable.java
            Roll Number: u4cse16159
            Name: Spriha
            Submitted on: 12/07/2017
*/
import java.util.Scanner;
class Amicable{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int sum1=0, sum2=0;
		int n1= s.nextInt();
		int n2= s.nextInt();
		for(int i=1; i<n1; i++){
			if(n1%i==0){
					sum1+=i;
					//System.out.println(i);
			}
		}
		//System.out.println(sum1);
		for(int i=1; i<n2; i++){
			if(n2%i==0){
					sum2+=i;
			}
		}
		//System.out.println(sum2);
		if(sum1==n2 && sum2==n1)
			System.out.println("Amicable number");
		else
			System.out.println("Not Amicable number.");
	}
}
