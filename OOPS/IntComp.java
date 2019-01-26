import java.util.*;
import java.io.*;

public class IntComp{
	public static void main(String args[]) throws Exception{
		File infile = new File("inint.txt");
		File outfile = new File("outint.txt");
		Scanner s = new Scanner(new BufferedReader(new FileReader(infile)));
		FileWriter f = new FileWriter(outfile);
		try{
			int large = 0;
			while(s.hasNextInt()){
				int i = s.nextInt();
				if(i>large)
					large = i;
			}
			System.out.println(large);
			f.write((int)large);
		}
		catch(IOException ioex){
			ioex.printStackTrace();
		}
		finally{
			if(f != null){
				f.flush();
				f.close();
			}
		}
	}
}