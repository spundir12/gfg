
/*
 * https://www.geeksforgeeks.org/graph-and-its-representations/
 * 
 *	Graph
 *BFS
 *DFS
 *Topological Sorting
 *
 *Graph can be represented by
 *	Adjacency Matrix  VxV matrix
 *	Adjacency List	for every vertex there is a list.
 *
 *		0----------1
 *      |	      /|
 *      |       /  |
 *      |     /    |
 *      |   /      |
 *      | /        |
 *      3          2
 *
 *    adjacency list
 *
 *     0--> 1, 3
 *     1--> 0, 3, 2
 *     2--> 1
 *     3--> 0,1
 *
 *     adjacency matrix
 *
 *			C++									Java
 *	Array of Vector for Adjacency List		Array of ArrayLists adjacency List
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
		//since graph is undirected we have to store value from v to u
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
