import java.util.*;

public class ListGraph{
	static class Edge{
		int src, dest, wt;

		public Edge(int s, int d, int w){
			src = s;
			dest = d;
			wt = w;
		}
	}

	static void createGraph(ArrayList<Edge> graph[]){
		for(int i=0 ; i<graph.length ; i++){
			graph[i] = new ArrayList<>();
		}

		graph[0].add(new Edge(0, 1, 1)); 
		graph[0].add(new Edge(0, 2, 1)); 

		
		graph[1].add(new Edge(1, 0, 1));
		graph[1].add(new Edge(1, 3, 1));

		graph[2].add(new Edge(2, 0, 1));
		graph[2].add(new Edge(2, 4, 1));

		graph[3].add(new Edge(3, 1, 1));
		graph[3].add(new Edge(3, 4, 1));
		graph[3].add(new Edge(3, 5, 1));
 
		graph[4].add(new Edge(4, 2, 1));
		graph[4].add(new Edge(4, 3, 1));
		graph[4].add(new Edge(4, 5, 1));

		graph[5].add(new Edge(5, 3, 1));
		graph[5].add(new Edge(5, 4, 1));
		graph[5].add(new Edge(5, 6, 1));

		graph[5].add(new Edge(6, 5, 1));

	}

	static void printGraph(ArrayList<Edge> graph[]){
		for(int i=0 ; i<graph.length ; i++){
			System.out.print(i+"--> ");
			for(int j=0 ; j<graph[i].size() ; j++){
				Edge e = graph[i].get(j);
				System.out.print(e.dest+" ");
			}
			System.out.println();
		}
	}

	static void bfs(ArrayList<Edge> graph[]){
		Queue<Integer> q = new LinkedList<>();
		boolean vis[] = new boolean[graph.length];
		q.add(0);

		while(!q.isEmpty()){
			int cur = q.remove();

			if(!vis[cur]){
				System.out.print(cur+" ");
				vis[cur] = true;

				for(int i=0 ; i<graph[cur].size() ; i++){
					Edge e = graph[cur].get(i);
					q.add(e.dest);
				}
			}
		}
	}

	static void dfs(ArrayList<Edge> graph[], int cur, boolean vis[]){
		System.out.print(cur+" ");
		vis[cur] = true;

		for(int i=0 ; i<graph[cur].size() ; i++){
			Edge e = graph[cur].get(i);
			if(!vis[e.dest]){
				dfs(graph, e.dest, vis);
			}
		}
	}

	static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]){
		if(src == dest) return true;
		vis[src] = true;

		for(int i=0 ; i<graph[src].size() ; i++){
			Edge e = graph[src].get(i);
			if(!vis[e.dest]){
				if(hasPath(graph, e.dest, dest, vis)){
					return true;
				}
			}

		}
		return false;
	}


	public static void main(String args[]){
		int V = 7;

		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
		printGraph(graph);
	
		System.out.print("bfs-->");
		bfs(graph);
	
		System.out.println();
		System.out.print("dfs-->");
		dfs(graph, 0, new boolean[V]);

		System.out.println();
		System.out.println(hasPath(graph, 0, 5, new boolean[V]));
	}

}