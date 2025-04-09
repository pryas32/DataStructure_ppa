representation of a graph

struct tree{
	
	int data;
	node * left;
	node * right;
	
}


struct graph{
	
	int data;
	vector<node *>adj; //it contains list of adjacent nodes;
	
	
	vector<int>adj[n+1]; //it contains list of nodes adjacent to a given nodes.
	for this adj[1]:[2,3];
	like this we have;
	
	adj[i].size() for degree of a particular node.
	
	//for dynamic having dense insertion and deletetion of nodes we can do like this
	vector <vector<int>>adj;
	
	 SC:O(V+E)
	TC :O(V+E);
	iterating over vertices and then iterating over its edges.
	
	
	//2nd way of representation of graph
	
	int adj[i][j]=1;
	else adj[i][j]=0;
	
	
	for a weighted graph you can put arr[i][j]=weight;
	for adjacency list
	adj(2,3);
	and so on;
	
	for a completed graph no edges=V^2;
	
	TC :O(V^2)
	SC: O(V^2);
	
	
	
	
	
	
	
	
	
 	
	
	
	
}




