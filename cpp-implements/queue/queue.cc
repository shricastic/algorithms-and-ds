#include <iostream>
using namespace std;

class Queue{
private:
  int* arr;
  int front, rear, size;

public:
  Queue(int size){
    arr = new int[size];
    this->size = size;
    front = rear = -1;
  }

  ~ Queue(){
    delete[] arr;
  }

  bool isEmpty(){
    return rear == -1;
  }

  bool isFull(){
    return rear == size-1;
  }

  void enque(int val){
    if(isFull()){
      cout<<"Queue is overflowing!\n";
      return;
    }
    if(isEmpty()) front = 0;

    rear++;
    arr[rear] = val;
  }

  void deque(){
    if(isEmpty()){
      cout<<"Queue is Underflowing!\n";
      return;
    }

    for(int i=0; i<rear ; i++){
      arr[i] = arr[i+1];
    }

    rear--;
    if(rear==-1) front=rear;
  }

  int peek(){
    if(isEmpty()){
      cout<<"Queue is Underflowing\n";
      return -1;
    }

    return arr[front];
  }
};



int main(){
  Queue q(5);
  q.enque(10);
  q.enque(20);
  q.enque(30);
  cout << "Front element: " << q.peek() << endl;
  q.deque();
  cout << "Front element after dequeue: " << q.peek() << endl;


  return 0;
}