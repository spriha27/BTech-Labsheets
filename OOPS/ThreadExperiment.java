public class ThreadExperiment extends Thread{
	public static void main(String[] args){
		int j = 1;
		public void print(i){
			System.out.println(i);
		}
		
		Thread A = new Thread("Odd"){
		@Override
		public void run(){
			while(j<=10){
				if(j%2==1)
				try{
					print(i);
					j++;
					wait();
				}
				catch(Exception e){}
				if(j%2==0){
					notify();
				}
			}
		}
	};
	Thread B = new Thread("Even"){
		@Override
		public void run(){
			while(j<=10){
				if(j%2==0)
				try{
					print(i);
					j++;
					wait();
				}
				catch(Exception e){}
				if(j%2==1){
					notify();
				}
			}
		}
	};
		A.start();
		B.start();
		try{
			A.join();
			B.join();
		}
		catch(Exception e){}
	}
}