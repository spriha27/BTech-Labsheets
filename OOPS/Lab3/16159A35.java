/*
            File Name: StopWords.java
            Roll Number: u4cse16159
            Name: Spriha Mandal
            Submitted on: 9th August 2017
*/
import java.util.Scanner;
import java.io.*;

public class StopWords {
	
	public static void main(String[] args) throws IOException{
		FileInputStream fin = new FileInputStream("input5.txt");
		try{
		 Scanner sc = new Scanner(new File("input5.txt"));
		 while(sc.hasNext()){
         String s = sc.next();
        if((s.compareToIgnoreCase("a")==0)||(s.compareToIgnoreCase("the")==0)||(s.compareToIgnoreCase("it")==0)||(s.compareToIgnoreCase("and")==0)||(s.compareToIgnoreCase("is")==0))
				continue;
			else
				System.out.println(s);
		}
	}
	finally{
		if(fin!=null)
			fin.close();
	}
}
}

