/*
            File Name: Reverse.java
            Roll Number: u4cse16159
            Name: Spriha Mandal
            Submitted on: 9th August 2017
*/

import java.io.*;
class Reverse
{
	public static void main(String[] args)
	{
		try{
			FileReader fr =new FileReader("input.txt");
			int c,count=0;
			char[] arr = new char[1000];
			while((c=fr.read())!= -1){
				arr[count]=(char)c;
				count++;
			}
			while(count>=0){
				System.out.print(arr[count]);
				count--;
			}		
			fr.close();
		}
		catch(FileNotFoundException fnfe)
		{
			System.exit(0);
		}
		catch(IOException ioe)
		{
			System.exit(0);
		}
	}
}
