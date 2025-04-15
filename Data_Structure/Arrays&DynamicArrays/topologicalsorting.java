//topological sorting where we need not to search from which node to get started from. we printing the order using stakc 


#include <bits/stdc++.h>
using namespace std;

void dfs(int node, vector<vector<int>> &adj, vector<int> &visited, stack<int> &s) {
    visited[node] = 1;
    for (int i = 0; i < adj[node].size(); i++) {
         if (visited[adj[node][i]] != 1) { 
            dfs(adj[node][i], adj, visited, s); 
        }
    }

    s.push(node);  
}

int main() {
    int n, m;
  
    cin >> n;

 
    cin >> m;

    vector<vector<int>> adj(n);  
   
    for (int i = 0; i < m; ++i) {
        int u, v;
        cin >> u >> v;
        adj[u].push_back(v); 
    }

    vector<int> visited(n, 0);
    stack<int> s;

 
    for (int i = 0; i < n; i++) {
        if (!visited[i]) {
            dfs(i, adj, visited, s);
        }
    }

  
    cout << "Topological Sort ";
    while (!s.empty()) {
        cout << s.top() << " ";
        s.pop();
    }
    cout << endl;

    return 0;
}
