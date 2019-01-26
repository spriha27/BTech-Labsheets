/*
            File Name: MatrixOOP.java
            Roll Number: u4cse16159
            Name: Spriha Mandal
            Submitted on: 3rd August 2017
*/

	import java.util.Scanner;
	public class MatrixOOP{
	int p, flag=0;
	Scanner s=new Scanner(System.in);
	int n = s.nextInt();	
	int[][] a= new int[n][n];
	public MatrixOOP(){
		for(int i=0; i<n; i++){
			for( int j=0; j<n; j++){
				a[i][j]=0;
			}
		}
	}

	public void takeInput(){
		for(int i=0; i<n; i++){
			for( int j=0; j<n; j++){
				a[i][j]=s.nextInt();
			}
		}
	}
	public void checkInput(){
		for(int i=0; i<n; i++){
			for( int j=0; j<n; j++){
				if(a[i][j]!=a[j][i]){
					flag=1;
					break;
				}
				else{
					flag=0;
				}
			}
		}
		if(flag==0)
			System.out.println("Symmetric Matrix");
		else
			System.out.println("Unsymmetric Matrix");
	}
}
