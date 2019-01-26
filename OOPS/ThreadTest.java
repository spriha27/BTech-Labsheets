public class ThreadTest{
	public static void main(String args[]){
	A threadA = new A();
	B threadB = new B();
	C threadC = new C();

	threadA.start();
	threadB.start();
	threadC.start();
	}
}