public class AdjacencyMatrix{
	public int v,e;
	public int[][] adj;

	AdjacencyMatrix(int a, int b){
		v=a;
		e=b;
		adj = new int[v+1][v+1];
		for(int i=0; i<v+1;i++){
			adj[i][0]=i;
			adj[0][i]=i;
		}
		for(int i=1; i<v+1;i++){
			for(int j=1; j<v+1;j++){
			adj[i][j]=0;
			}
		}		
	}

	public void addDirectedEdge(int a, int b){
		adj[a][b]=1;
	}

	public void addUndirectedEdge(int a, int b){
		adj[a][b]=1;
		adj[b][a]=1;
	}

	public void printAdjMatrix(){
		for(int i=0; i<v+1;i++){
			for(int j=0; j<v+1;j++){
			System.out.print(adj[i][j] + " ");
			}
		System.out.println();
		}
	}

	public void BFS(int source){
		int current, next;
		QueueInt q = new QueueInt();
		int[] dist = new int[v+1];
		for(int i=1; i<v+1; i++){
			dist[i]=-1;
		}
		int s = source;
		q.enqueue(s);
		dist[s]=0;
		while(!q.IsEmpty()){
			current = q.getFront();
			q.dequeue();
			for(int i=1; i<v+1;i++){
				if(adj[current][i]==1){
					next = i;
					if(dist[next]==dist[current]+1 || dist[next] ==-1){
						q.enqueue(next);
						dist[next] = dist[current]+1;
					}
				}					
			}
		}
		for(int i=1; i<v+1; i++){
			System.out.println("Distance of "+i+" from "+s+" is "+dist[i]);
		}
	}

	public void DFS(int source){
		boolean[] visited = new boolean[v+1];
		System.out.println("DFS traversal is: ");
		doDFS(visited, source);
	}

	public void doDFS(boolean[] visited, int source){
		int s = source;
		System.out.print(s+" ");
		for(int i=1; i<v+1; i++){
			if(adj[s][i]==1){
				if(!visited[i]){
					doDFS(visited, i);
					visited[i]=true;
				}
			}
		}
	}
}