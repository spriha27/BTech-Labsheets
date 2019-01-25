/*
            File Name: SimpleCalculator.java
            Roll Number: u4cse16159
            Name: Spriha Mandal
            Submitted on: 3rd August 2017
*/

	import java.util.Scanner;
	class SimpleCalculator{
	int number;
	String operation;

	SimpleCalculator(int number){
		this.number=number;
	}

	Scanner s= new Scanner(System.in);

	void addInteger(){
		int number=s.nextInt();
		int sum= this.number + number;
		System.out.println(sum);
	}
	void subtractInteger(){
		int number=s.nextInt();
		int dif= this.number - number;
		System.out.println(dif);
	}
	void multiplyInteger(){
		int number=s.nextInt();
		int prod= this.number * number;
		System.out.println(prod);
	}
	void divideInteger(){
		int number=s.nextInt();
		int quo= this.number / number;
		System.out.println(quo);
	}
	void performCalculation(){
		this.operation=s.nextLine();
		char op =operation.charAt(0);
		switch(op){
			case '+':{
				addInteger();
				break;
			}
			case '-':{
				subtractInteger();
				break;
			}
			case '*':{
				multiplyInteger();
				break;
			}
			case '/':{
				divideInteger();
				break;
			}
			default:
				System.out.println("Invalid Operator");

		}
	}
	public static void main(String[] args){
		SimpleCalculator sc = new SimpleCalculator(10);
		sc.performCalculation();
	}
}
