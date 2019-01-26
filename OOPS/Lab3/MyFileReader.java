import java.io.*;
class MyFileReader
{
	public static void main(String[] args)
	{
		try{
			FileReader fr =new FileReader("input.txt");
			int c;
			while((c=fr.read())!= -1){
			System.out.print((char) c);
			}
			System.out.println();		
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
