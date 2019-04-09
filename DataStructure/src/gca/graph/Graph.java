
/*
 * https://www.geeksforgeeks.org/graph-and-its-representations/
 */
package gca.graph;

import java.util.ArrayList;
import java.util.LinkedList;

 class GraphOldWay{
	int v;
	LinkedList<Integer> adjList[];
	public GraphOldWay(int v) {
		this.v=v;
		adjList = new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adjList[i]=new LinkedList<>();
		}
	}
	
	public void addEdge(GraphOldWay g, int src, int dest)
	{
		g.adjList[src].add(dest);
		//since graph is undirected
		//therefore
		g.adjList[dest].add(src);
	}
}
public class Graph{
	public static void addEdge(ArrayList<Integer> []adjList, int u, int v)
	{
		if(adjList[u]==null)
		{
			adjList[u]=new ArrayList<>();
		}
		if(adjList[v]==null)
		{
			adjList[v]=new ArrayList<>();
		}
		adjList[u].add(v);
		adjList[v].add(u);
		
	}
	public static void main(String[] args) {
		int v=4;
		ArrayList<Integer> adjList[]=new ArrayList[v];
		addEdge(adjList, 0, 1);
	}

}
