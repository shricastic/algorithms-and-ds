#include<bits/stdc++.h>

using namespace std;

class Graph{
private:
  int V;
  vector<vector<int>> adjList;

public:
  Graph(int V){
    this->V = V;
    adjList.resize(V);
  }
  
  void addEdge(int u, int v){
    adjList[u].push_back(v);
    adjList[v].push_back(u);
  }

  void bfs(int start){
    vector<bool> vis(V, false);
    queue<int> queue;

    vis[start] = true;
    queue.push(start);

    while(!queue.empty()){
      int v = queue.front();
      queue.pop();

      cout << v << " ";
      
      for(int u : adjList[v]){
        if(!vis[u]){
          vis[u] = true;
          queue.push(u);
        }
      }
    }
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

