#include <iostream>
#include <vector>

using namespace std;

class Graph{
private:
  int V;
  vector<pair<int, int>> edgeList;

public:
  Graph(int V){
    this->V = V;
  }

  void addEdge(int u, int v){
    edgeList.push_back({u, v});
  }

  void printGraph(){
    for(auto p : edgeList){
      cout<<p.first<< " -> "<< p.second<< endl;
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
