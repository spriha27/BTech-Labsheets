import java.util.*;
import java.lang.*;

public class ThreadExperiment extends Thread{

	synchronized void pri(int i){
		System.out.println(i);
	}

	Thread A = new Thread("Odd"){
		int j=1;
		@Override
		public synchronized void run(){
			while(j<=10){
				if(j%2==0)
				try{
					wait();
				}
				catch(Exception e){}
				pri(j);
				j++;
				notify();
			}
		}
	};

	Thread B = new Thread("Even"){
		int j=1;
		@Override
		public synchronized void run(){
			while(j<=10){
				if(j%2==1)
				try{
					wait();
				}
				catch(Exception e){}
				pri(j);
				j++;
				notify();
			}
		}
	};
	// class Doer{
	// 	static final Object Lock = new Object();
	// }
	

	public static void main(String[] args) throws Exception{
		A a = new A();
		B b = new B();
		a.start();
		Thread.sleep(1000);
		b.start();
		try{
			a.join();
			b.join();
		}
		catch(Exception e){}
	}
}