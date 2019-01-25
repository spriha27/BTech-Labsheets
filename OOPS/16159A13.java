/*
            File Name: Emirp.java
            Roll Number: u4cse16159
            Name: Spriha
            Submitted on: 12/07/2017
*/
import java.util.Scanner;
class Emirp{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int r=0, flag=0;
		int n= s.nextInt();
		if(n%2==0)
			System.out.println(n + " is not a prime number.");
		else{
			for(int i=3; i<=n/2; i=i+2){
				if(n%i==0){
					System.out.println(n + " is not a prime number.");
					break;
				}
				else
				flag=1;
			}
		}
		while(n>0){
			r=(r*10)+(n%10);
			
			n=n/10;
		}
		//System.out.println(r+" ");
		if(r%2==0)
			System.out.println(r + " is not a prime number.");
		else{
			for(int i=3; i<=r/2; i=i+2){
				if(r%i==0){
					System.out.println(r + " is not a prime number.");
					break;
				}
				else
				flag=1;
			}
		}
		if(flag==1)
		System.out.println(r + " is a prime number.");
	}
}
