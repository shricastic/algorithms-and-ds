#include <iostream>
#include <vector>
using namespace std;

class Graph{
private:
  int V;
  vector<vector<int>> adjMatrix;

public:
  Graph(int vertices){
    V = vertices;
    adjMatrix.resize(V, vector<int>(V, 0));
  }

  void addEdge(int src, int dest){
    adjMatrix[src][dest] = 1;
    adjMatrix[dest][src] = 1;
  }

  void printGraph(){
    for(int i=0 ; i<V ; i++){
      for(int j=0 ; j<V ; j++){
        cout<<adjMatrix[i][j]<<" ";
      }
      cout<<endl;
    }
  }
};

bool hasPath(Graph graph, int src, int dest, vector<bool> vis){
  if(src == dest);
  vis[src] = true;

  for(int i=0 ; i<graph.size() ; i++){
    for(int j=0 ; j<graph[i].size() ; j++){
      Edge e = graph[i][j];

      if(!vis[]){
        if(hasPath(graph,//src,dest, vis)){
          return true;
        }
      }
    }
  }

  return false;
}


int main(){
  Graph graph(7);

  graph.addEdge(0,1);
  graph.addEdge(0,2);
  graph.addEdge(1,3);
  graph.addEdge(2, 4);
  graph.addEdge(3, 4);
  graph.addEdge(3, 5);
  graph.addEdge(4, 5);
  graph.addEdge(5, 6);

  graph.printGraph();

  return 0;
}
