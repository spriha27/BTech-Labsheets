public class MeanMedianModeTest{
	public static void main(String arg[]){
		
	Scanner s= new Scanner(System.in);
	int n =s.nextInt();
	while(!hasNextInt)
	//to check whether it is an integer.
	{
		System.out.println("Please enter an integer: ");
		int n = s.nextInt();
	}
	int values = new int[n];
	for(int i=0; i<n;i++){
		vallues[i]=s.nextInt();
		System.out.println(" Median is :" + MeanMedianMode.findMean(values));
		System.out.println(" Mode is :" + MeanMedianMode.findMode(values));
	}
}
