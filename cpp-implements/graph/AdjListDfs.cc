#include <bits/stdc++.h>
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

  void addEdge(int v, int u){
    adjList[u].push_back(v);
    adjList[v].push_back(u);
  }

  void dfsRecursive(int start){
    vector<bool> vis(V, false);
    dfsHelper(start, vis);
  }

  void dfsHelper(int v, vector<bool>& vis){
    vis[v] = true;
    cout<< v << " "; 

    for(int u : adjList[v]){
      if(!vis[u]){
        dfsHelper(u, vis);
      }
    }
  }

  void dfsIterative(int start){
    vector<bool> vis(V, false);
    stack<int> stack;
    stack.push(start);

    while(!stack.empty()){
      int v = stack.top();
      stack.pop();

      if(!vis[v]){
        cout<< v << " ";
        vis[v] = true;
      }
      
      //in order to traverse from left to right we must reverse the iteration order 
      //we also can use regular for loop instead but it will traverse from right to left
      for(auto it = adjList[v].rbegin() ; it != adjList[v].rend() ; it++){
        if(!vis[*it]){
          stack.push(*it);
        }
      }
    }

  }
}
;

int main(){    
    Graph g(6);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 3);
    g.addEdge(1, 4);
    g.addEdge(2, 5);
    
    cout << "DFS starting from vertex 0 using recursive approach: " << endl;
    g.dfsRecursive(0);

    cout << "DFS starting from vertex 0 using iterative approach: " << endl;
    g.dfsIterative(0);

    return 0;
}
