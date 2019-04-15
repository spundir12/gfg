package gca.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void addEdge(ArrayList<Integer>adj[],int u, int v)
	{
		if(adj[u]==null)
		{
			adj[u]=new ArrayList<>();
		}
		//since graph is undirected we have to store value from v to u
		if(adj[v]==null)
		{
			adj[v]=new ArrayList<>();
		}
		adj[u].add(v);
		adj[v].add(u);
	}
	public static void bfs(ArrayList<Integer>adj[],int src)
	{
		 boolean visited[]=new boolean[adj.length];
		 Queue<Integer>q = new LinkedList<>();
		 q.add(src);
		 while(!q.isEmpty())
		 {
			 int v = q.poll();
			 System.out.print(v+" ");
			 visited[v]=true;
			 for(Integer i:adj[v])
			 {
				 if(!visited[i])
				 {
					 visited[i]=true;
					 q.add(i);
				 }
			 }
		 }
	}
	public static void main(String[] args) {
		int v=5;
		ArrayList<Integer> adj[] = new ArrayList[v];
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 4);
		bfs(adj, 0);
		System.out.println();
	}

}
