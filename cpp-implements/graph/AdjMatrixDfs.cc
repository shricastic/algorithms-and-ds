#include <bits/stdc++.h>

using namespace std;

class Graph{
private:
  int V;
  vector<vector<int>> adjMatrix;

public:
  Graph(int V){
    this->V = V;
    adjMatrix.resize(V, vector<int>(V, 0));
  }
  
  void addEdge(int u, int v){
    adjMatrix[u][v] = 1;
    adjMatrix[v][u] = 1;
  }

  void dfs(int u, vector<bool>& vis){
    cout<< u <<" ";
    vis[u] = true;
    

    for(int i=0; i<adjMatrix[0].size() ; i++){
      if(adjMatrix[u][i]==1 && !vis[i]){
        dfs(i, vis);
      }
    }
  }
  
};


int main(){

    Graph g(6);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 3);
    g.addEdge(1, 4);
    g.addEdge(2, 5);
    
    vector<bool> vis(6, false);
    g.dfs(0, vis);


  return 0;
}
