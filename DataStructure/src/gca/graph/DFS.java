package gca.graph;

import java.util.ArrayList;
import java.util.Iterator;

public class DFS {

	public static void addEdge(ArrayList<Integer>adjList[],int u, int v)
	{
		if(adjList[u]==null)
			adjList[u]=new ArrayList<>();
		//since graph is undirected we have to store value from v to u
		if(adjList[v]==null)
			adjList[v]=new ArrayList<>();

		adjList[u].add(v);
		adjList[v].add(u);
	}
	public static void dfs(ArrayList<Integer>adjList[],int src)
	{
		boolean visited[]=new boolean[adjList.length];
		dfsUtil(adjList,src,visited);
	}
	public static void dfsUtil(ArrayList<Integer>adjList[],int src, boolean []visited)
	{
		System.out.print(src+" ");
		visited[src]=true;
		for(Integer i:adjList[src]) {
			if(!visited[i])
			{
				dfsUtil(adjList, i, visited);
			}
		}
	}
	public static void main(String args[]) {
		int v=5;
		ArrayList<Integer> adj[] = new ArrayList[v];
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 4);
		dfs(adj, 0);
		System.out.println();
	}
}
