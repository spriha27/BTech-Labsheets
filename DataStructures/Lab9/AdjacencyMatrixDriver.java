import java.util.Scanner;

public class AdjacencyMatrixDriver {
	public static void main(String args[]){
		int n=0,e=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of nodes: ");
		n = s.nextInt();
		System.out.println("Enter no. of edges: ");
		e = s.nextInt();
		int[][] edges = new int[e][2];
		int[][] adj = new int[n+1][n+1];
		for(int i=0;i<e;i++){
			for(int j=0;j<2;j++){
				edges[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			adj[i][0]=i;
			adj[0][i]=i;
		}
		for(int i=0;i<e;i++){
				adj[edges[i][0]][edges[i][1]]=1;
		}
		for(int i=0;i<n+1;i++){
			for(int j=0;j<n+1;j++){
				System.out.print(adj[i][j] +" ");
			}
			System.out.println();
		}
	}
}