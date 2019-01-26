/*
            File Name: MatrixTranspose.java
            Roll Number: u4cse16159
            Name: Spriha
            Submitted on: 12/07/2017
*/
import java.util.Scanner;
class MatrixTranspose{
	public static void main(String[] args){
		int p, flag=0;
		int[][] a= new int[3][3];
		int[][] b= new int[3][3];
		Scanner s=new Scanner(System.in);
		for(int i=0; i<3; i++){
			for( int j=0; j<3; j++){
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0; i<3; i++){
			for( int j=0; j<3; j++){
				b[i][j]=a[j][i];
			}
		}
		for(int i=0; i<3; i++){
			for( int j=0; j<3; j++){
				if(a[i][j]!=b[i][j]){
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
