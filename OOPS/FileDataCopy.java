import java.io.*;

public class FileDataCopy{
	public static void main (String args[]) {
		String fileName="out.data";
		String message = "Hello world";
		long start,elapsed;
		try{
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
				out.writeInt(1234);
				out.writeChar('A');
			for(int i = 0; i<message.length();i++){
				out.write(i);
			}
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
			System.out.println(in.readInt());
			System.out.println(in.readChar());			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}

