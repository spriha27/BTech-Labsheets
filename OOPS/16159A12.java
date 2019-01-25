/*
            File Name: MultiplicationTable.java
            Roll Number: u4cse16159
            Name: Spriha
            Submitted on: 12/07/2017
*/
import java.util.Scanner;
class MultiplicationTable{
	public static void main(String[] args){
		int n;
		Scanner s=new Scanner(System.in);
		n= s.nextInt();
		for(int i=1; i<=10;i++){
			System.out.println(i+" X "+n+" = "+(i*n));
		}
	}
}
