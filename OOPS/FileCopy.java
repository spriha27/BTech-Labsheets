import java.io.*;

public class FileCopy{
	public static void main (String args[]) {
		String inFile="sea.jpg";
		String outFile = "sea1.jpg";
		long start,elapsed;
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		File input = new File(inFile);
		System.out.println("Size of file is: "+input.length());
		
		/*try{
			in = new FileInputStream(inFile);
			out = new FileOutputStream(outFile);//we can also se BufferedInput/OutputStream, like in = new BufferedInputStream(FileInputStream (inFile)); out= new BufferedOutputStream(BufferedOutputStream (outFile));
			start = System.nanoTime();
			int byteread;
			while((byteread = in.read()) != -1){
				out.write(byteread);
			}
			elapsed = System.nanoTime()-start;
			System.out.println("Elapsed Time : "+elapsed/1000000.0);
		}*/
		try(in = new FileInputStream(inFile); out = new FileOutputStream(outFile)){
			start = System.nanoTime();
			int byteread;
			byte[] byteBuf = new byte[4096];
			while((byteread = in.read(byteBuf)) != -1){
				out.write(byteBuf,0,byteread);
			}
			elapsed = System.nanoTime()-start;
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}

