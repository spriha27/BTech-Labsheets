/*
            File Name: HODReportDriver.java
            Roll Number: u4cse16159
            Name: Spriha Mandal
            Submitted on: 9th August 2017
*/
public class HODReportDriver{
	public static void main(String[] args){
		HOD H1 = new HOD(1,"qwerty",34.5,12.34);
		HOD H2 = new HOD(2,"zxcvb",3.5,12.4);
		HOD H3 = new HOD(3,"jghkf",45.55,121.4);
		char c;

		try{
			while(in.available()>0){
				c=(char)in.read();
				System.out.println(c);
			}
		}
		finally{
			if(in!=null)
				in.close();
			if(out!=null)
				out.close();
		}
	}

}
