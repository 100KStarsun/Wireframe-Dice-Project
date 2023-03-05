package diceStuff;

public class Die {
	private Node[] nodes;
	
	private class Node implements Comparable<Node> {
		private Edge[] edges;
		private int value;
		private Node parent;
		
		
		private Node (int value, Edge[] paths) {
			this.value = value;
			this.edges = paths;
			parent = this;
		}
		
		
		private Node[] getConnections() {
			Node[] adj = new Node[edges.length];
			for (int i = 0; i < adj.length; i++) {
				adj[i] = edges[i].endNode;
			}
			return adj;
		}
		
		
		private boolean isConnected (Node n) {
			for (Edge e : edges)
				if (e.endNode.equals(n))
					return true;
			return false;
		}
		private Edge getEdgeToNode (Node n) {
			if (this.isConnected(n))
				for (Edge e : edges)
					if (e.endNode.equals(n))
						return n;
			return null;
		}
		private boolean equals (Node n) { return value == n.value; }
		@Override
		public int compareTo (Node n) {
			if (value > n.value)
				return 1;
			if (value == n.value)
				return 0;
			return -1;
		}
	}
	
	private class Edge {
		private Node endNode;
		private Edge (Node otherNode) {
			this.endNode = otherNode;
		}
	}
	
	public Die (int numSides) {
		nodes = new Node[numSides];
		for (int i = 0; i < nodes.length; i++)
			nodes[i].value = i + 1;
	}
	public Die (boolean[][] adj) {
		nodes = new Node[adj.length];
		int polyNum = 0;
		for (int i = 0; i < nodes.length; i++) {
			nodes[i].value = i + 1;
			if (adj[0][i])
				polyNum++;
		}
		for (int i = 0; i < nodes.length; i++) {
			nodes[i].edges = new Edge[polyNum];
			for (int j = i; j < nodes.length; j++) {
				if (adj[i][j]) {
					nodes[i].edges
				}
			}
		}
		
	}
}
