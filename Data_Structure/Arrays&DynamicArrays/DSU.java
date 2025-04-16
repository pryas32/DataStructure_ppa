



#include <bits/stdc++.h> 
using namespace std;
//DSU ->Disjoint Set Union it is used for finding cycle in a undirected  graph. in O(logn) time

for directed graph DSU isnt applicable-> explanation-In a connected component, there is a path between any two vertices which are part of the component.
Now, if there is any edge from one of the vertices in the component, to a new vertex, 
then the new vertex also becomes part of the connected component: because, 
all the vertices of the component can be reached from this new vertex and vice versa.
The same is not true for a directed graph. In directed graph,
if there's a strongly connected component, and there's an edge from one of the vertices in the 
component to a new vertex, then the new vertex will definitely be "reachable",
but it is not necessary that all the vertices of the component may be reachable by this new vertex. 
Hence, taking the union of the two sets does not make sense, even if an edge exists between
two connected components.



int findparent(int node)
{

while(parent[node]!=node)
{
	node=parent[node];
}
	return node;
}

bool getroot(int i,int j)
{
	if(finparent[i]==findparent[j])
	{
		return true;
	}
	else{
		return false;
	}
}

int union(int i,int j)
{
	if(getroot(i,j))
	{
		return 0;
	}
	
	if(size[i]>size[j])
	{
		parent[j]=parent[i];
		size[i]+=size[j];
	}
	else{
		parent[i]=parent[j];
		size[j]+=size[i];
	}
}

int main() {
int parent[5];
int size[5];

set<int>s;
	s.insert(0);
    s.insert(1);
    s.insert(2);
    s.insert(3);
    s.insert(4);
   
   vector<int>v(s.begin(),s.end());
   
   
   for(int i=0;i<5;i++)
   {
   	parent[i]=v[i];
   	size[i]=1;
   }
   
   int i,j;
   cin>>i>>j;
 union(i,j);
   
	return 0;
}
