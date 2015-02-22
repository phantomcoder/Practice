package Graphs;

public class GraphDepthFirstSearch {

	//DFS on a graph.
	public static void main(String[] args) 
	{
		
		
	}
	
	public static class Graph
	{
		public Vertex[] adjLists;
		
		
		public void dfs()
		{
			boolean[] visited = new boolean[adjLists.length];
			
			for(int v = 0; v < visited.length; v++)
			{
				if(!visited[v])
				{
					dfs(v, visited);
				}
			}
		}
		
		private void dfs(int v, boolean[] visited)
		{
			visited[v] = true;
			System.out.println(v);
			
			for(Neighbor nbr = adjLists[v].adjacencyList; nbr != null; nbr = nbr.next )
			{
				if(!visited[nbr.vertexNumber])
				{
					System.out.println(adjLists[v].vertexName+"--"+adjLists[nbr.vertexNumber].vertexName);
					dfs(nbr.vertexNumber, visited);
				}
				
			}
		}
	}

	public static class Vertex
	{
		public String vertexName;
		public Neighbor adjacencyList;
		
		public Vertex(String name, Neighbor neighbors)
		{
			this.vertexName = name;
			this.adjacencyList = neighbors;
		}
		
	}
	
	public static class Neighbor
	{
		public int vertexNumber;
		public Neighbor next;
		
		public Neighbor(int verNum, Neighbor n)
		{
			this.vertexNumber = verNum;
			this.next = n;
		}
	}
}
