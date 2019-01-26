public class Truck{
	public static void main(String args[]){
		PumpQueue p = new PumpQueue();
		p.insertPump(new Pump(4,6));
		p.insertPump(new Pump(6,5));
		p.insertPump(new Pump(4,5));
		p.insertPump(new Pump(7,3));
		System.out.println(p.getStart());
	}
}
