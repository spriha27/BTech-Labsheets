public class Car{
	public int petrol;
	public int odometer;
	public int kmpl;

	public Car(){
		kmpl = 0;
		odometer = 0;
		petrol = 0;
	}

	public Car(int n){
		odometer = 0;
		petrol = 0;
		try{
			if(n<0){
			kmpl = 30;
			throw new NegativeNumberException("Negative number entered. Please enter correct number.");
			}
		
			else{
			kmpl = n;
			}
		}
		catch(NegativeNumberException e){
			System.out.println("hi");
		}
	}

	public void getKilometersPerLitre(){
		System.out.println(kmpl);
	}

	public void addPetrolLitres(int number) {
		try{
            if (number < 0){
         	throw new NegativeNumberException("Negative number entered. Please enter correct number.");
  }
      	else petrol = number;
    }
    catch(NegativeNumberException e){
			System.out.println("hi");
		}
}

   public boolean drive(int km){
   	if(km <= petrol*kmpl){
   		odometer = (petrol * kmpl) - km;
   		petrol = petrol - (km/kmpl);
   		return true;
   	}
   	else return false;
   }

   public void getKilometersDriven(){
   	System.out.println(this.odometer);
   }

}