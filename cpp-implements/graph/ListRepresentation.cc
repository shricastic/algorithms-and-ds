#include <iostream>
#include <vector>
#include <list>

using namespace std;

class Graph{
private:
  int V;
  vector<list<int>> adjList;

public:
  Graph(int V){
    this->V = V;
    adjList.resize(V);
  }

  void addEdge(int u, int v){
    adjList[u].push_back(v);
    adjList[v].push_back(u);
  }

  void printGraph(){
    for(int i=0 ; i<V ; i++){
      cout << "Vertex " << i << ": ";
      for(int v: adjList[i]){
        cout << "-> " <<v;
      }
      cout << endl;
    }
  }
};

int main(){
  Graph g(4);
  g.addEdge(0, 1);
  g.addEdge(0, 3);
  g.addEdge(1, 2);
  g.addEdge(2, 3);

  g.printGraph();
  
  return 0;
}
