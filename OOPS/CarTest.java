public class CarTest{
	public static void main(String args[]){
		Car c1 = new Car();
		c1.getKilometersPerLitre();
		Car c2 = new Car(45);
		c2.getKilometersPerLitre();
		Car c3 = new Car(-20);
		//throw  new NegativeNumberException("kl") ;
		c3.getKilometersPerLitre();
		c1.addPetrolLitres(10);
		c1.drive(60);
		c1.getKilometersDriven();
		
}
}