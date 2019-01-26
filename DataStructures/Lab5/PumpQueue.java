public class PumpQueue{
	Pump[] arr = new Pump[5];
	int front = -1;
	int rear = -1;
	
	PumpQueue() {
		arr = new Pump[10];
		front = -1;
		rear=-1;
	}
	PumpQueue(int size) {
		arr = new Pump[size];
		front = -1;
		rear=-1;
	}

	public boolean pumpFull(){
		if((rear+1)%arr.length==front)
			return true;
		else 
			return false;
	}

	public boolean pumpEmpty(){
		if(front==-1 && rear == -1)
			return true;
		else 
			return false;
	}

	public void insertPump(Pump p){
		if(pumpFull())
			System.out.println("Pump circle full. Please increase the size");
		else if(pumpEmpty()){
			front++;
			rear++;
			arr[rear]=p;
		}
		else{
			rear++;
			arr[rear]=p;
		}
	}

	public boolean checkCircle(int i){
		int pos=i;
		int capacity=arr[i].petrol;
		int distance=arr[i].dist;
		i= (i+1)%(rear+1);
		do{
			if(capacity-distance>=0){
				capacity-=distance;
				//System.out.println("hi");
			}
			else{
				return false;
			}
			distance=arr[i].dist;
			capacity+=arr[i].petrol;
			i= (i+1)%(rear+1);
			//System.out.println("bye");
		}
		while((i-1)%(rear+1)!=pos);
		return true;
	}

	public String getStart(){
		//System.out.println(front);
		for(int i=front; (i+1)%arr.length != (rear+1); i=(i+1)%arr.length){
			//System.out.println(i);
			if((arr[i].petrol)>=(arr[i].dist)){
				// System.out.println(arr[i].petrol);
				// System.out.println(arr[i].dist);
				if(checkCircle(i)){
					return "Start = " + (i);
				}
			}
			else {
				//System.out.println("tick");
			}
		}
		return "No starting point";
	}
}
