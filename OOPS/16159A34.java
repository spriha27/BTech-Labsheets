/*
            File Name: CountVowels.java
            Roll Number: u4cse16159
            Name: Spriha Mandal
            Submitted on: 9th August 2017
*/

import java.io.*;
class CountVowels
{
	public static void main(String[] args)
	{
		try{
			FileReader fr = new FileReader("input.txt");
			int c,count=0;
			while((c=fr.read())!= -1){
				if((char) c=='a' || (char) c=='e' || (char) c=='i' || (char) c=='o' || (char) c=='u'){
				count++;
				}
		    }	
			fr.close();
		    System.out.println(count);
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
