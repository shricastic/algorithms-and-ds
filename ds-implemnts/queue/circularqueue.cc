#include <iostream>
using namespace std;

class CircularQueue{
private:
	int* arr;
	int front, rear, size;

public:
	CircularQueue(int size){
		arr = new int[size];
		this->size = size;
		front = rear = -1;
	}

	~ CircularQueue(){
		delete[] arr;
	}

	bool isEmpty(){
		return front==-1 && rear==-1;
	}

	bool isFull(){
		return (rear+1)%size == front;
	}

	void enqueue(int val){
		if(isFull()){
			cout<<"Queue is overflowing!\n";
			return;
		}

		if(front==-1) front=0;
		rear = (rear+1)%size;
		arr[rear] = val;
	}

	int dequeue(){
		if(isEmpty()){
			cout<<"Queue is Underflowing\n";
			return -1;
		}

		int tmp = arr[front];

		if(front==rear) front=rear=-1;
		front = (front+1)%size;
		return tmp;
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
	CircularQueue q(5);
	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	cout << "Front element: " << q.peek() << endl;
	q.dequeue();
	cout << "Front element after dequeue: " << q.peek() << endl;

	return 0;
}
