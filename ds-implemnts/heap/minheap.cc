#include <iostream>
#include <vector>
using namespace std;

class MinHeap{
private:
  vector<int> heap;

public:
  MinHeap(){
  }

  ~MinHeap(){
  }

  void insert(int val){
    heap.push_back(val);

    int ci = heap.size()-1;
    while(ci > 0){
      int pi = (ci-1)/2;
      if(heap[ci]<heap[pi]){
        swap(heap[ci], heap[pi]);
        ci=pi;
      } else{
        break;
      }
    }
  }
  
  int remove(){ 
    int tmp = heap[0];
    swap(heap[0], heap[heap.size()-1]);
    heap.pop_back();
    
    heapify(0);

    return tmp;
  }

  void heapify(int i){
    int left = 2*i+1;
    int right = 2*i+2;
    int minIdx = i;

    if(left<heap.size() && heap[minIdx]>heap[left]){
      minIdx = left;
    }

    if(right<heap.size() && heap[minIdx]>heap[right]){
      minIdx = right;
    }
    
    if(minIdx != i){
      swap(heap[i], heap[minIdx]);
      heapify(minIdx);
    }
  }

  int peek(){
    if(isEmpty()){
      return 0;
    }
    return heap[0];
  }

  bool isEmpty(){
    return heap.empty();
  }

};




int main(){
  MinHeap minHeap;

  minHeap.insert(5);
  minHeap.insert(3);
  minHeap.insert(8);

  cout<<"min element: "<<minHeap.peek() <<endl;
  int minval = minHeap.remove();
  cout<<"removed element: "<<minval<<endl;

  cout<<"min element:"<<minHeap.peek()<<endl;

  return 0;
}
