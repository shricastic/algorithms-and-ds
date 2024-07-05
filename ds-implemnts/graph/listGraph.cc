#include <iostream>
#include <vector>
using namespace std;

class Edge{
public:
	int src, dest, wt;
public:
	Edge(int s, int d, int w){
		src = s; 
		dest = d;
		wt = w;
	}

};

int main(){
  int v = 7; 
  
  vector<vector<Edge>> graph(v);

  graph[0].push_back(Edge(0,1,1));
  graph[0].push_back(Edge(0,2,1));
  

  graph[1].push_back(Edge(1, 0, 1));
  graph[1].push_back(Edge(1, 3, 1));

  graph[2].push_back(Edge(2, 0, 1));
  graph[2].push_back(Edge(2, 4, 1));

  graph[3].push_back(Edge(3, 1, 1));
  graph[3].push_back(Edge(3, 4, 1));
  graph[3].push_back(Edge(3, 5, 1));

  graph[4].push_back(Edge(4, 2, 1));
  graph[4].push_back(Edge(4, 3, 1));
  graph[4].push_back(Edge(4, 5, 1));

  graph[5].push_back(Edge(5, 3, 1));
  graph[5].push_back(Edge(5, 4, 1));
  graph[5].push_back(Edge(5, 6, 1));

  graph[6].push_back(Edge(6, 5, 1));
  

  for(int i=0 ; i<v ; i++){
    cout<<i<<"-->";
    for(int j=0 ; j<graph[i].size() ; j++){
      Edge e = graph[i][j];
      cout<<e.dest<<" ";
    }
    cout<<endl;
  }

  return 0;
}
