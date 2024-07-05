#include <iostream>
using namespace std;

class MinHeap{
private:
  vector<int>* heap;

public:
  MinHeap(){
    heap = new vector<int>;
  }

  ~MinHeap(){
    heap.clear();
    delete heap; 
  }

  void insert(int val){
    heap.push_back(data);

    int ci = heap.size()-1;
    int pi = (ci-1)/2;

    while(ci>0 && heap[ci]>heap[pi]){
      swap(heap[ci], heap[pi]);
      ci = pi;
      pi = (ci-1)/2;
    }
  }
  


  
};




int main(){
	return 0;
}
