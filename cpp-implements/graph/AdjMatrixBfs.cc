#include <bits/stdc++.h>

using namespace std;

class Graph{
private:
  int V;
  vector<vector<int>> adjMatrix;

public:
  Graph(int V){
    this->V = V;
    adjMatrix.resize(V, vector<int> (V, 0));
  }

  void addEdge(int u, int v){
    adjMatrix[u][v] = 1;
    adjMatrix[v][u] = 1;
  }

  void bfs(int u){
    queue<int> queue;
    vector<bool> vis(V, false);
    queue.push(u);
    vis[u] = true;

    while(!queue.empty()){
      int u = queue.front();
      queue.pop();
      
      cout << u << " ";
      

      for(int v = 0 ; v<V ; v++){
        if(adjMatrix[u][v] == 1 && !vis[v]){
          queue.push(v);
          vis[v] = true;
        } 
      }
      
    }

    cout << endl;
    
  }
};


int main(){
  Graph g(4);
  g.addEdge(0, 1);
  g.addEdge(0, 2);
  g.addEdge(1, 2);
  g.addEdge(2, 3);

  cout << "BFS starting from vertex 0: ";
  g.bfs(0);
  
  return 0;
}
