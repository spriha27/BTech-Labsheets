import java.util.Scanner;

public class AdjacencyMatrixDriver{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int ver, edges,a,b;
		System.out.println("Enter the no. of vertices and edges:");
		ver = s.nextInt();
		edges = s.nextInt();
		AdjacencyMatrix adjm = new AdjacencyMatrix(ver, edges);
		for(int i=1;i<=edges;i++){
			System.out.println("1 for Directed edge and 2 for Undirected edge");
			if(s.nextInt() == 1){
				a=s.nextInt();
				b=s.nextInt();
				adjm.addDirectedEdge(a,b);
			}
			else{
				a=s.nextInt();
				b=s.nextInt();
				adjm.addUndirectedEdge(a,b);
			}
		}
		System.out.println("Enter source vertex:");
		int source = s.nextInt();
		// adjm.printAdjMatrix();
		// adjm.BFS(source);
		adjm.DFS(source);
	}
}