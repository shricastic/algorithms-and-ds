	#include <iostream>
	using namespace std;

	class Node{
	public:
		int val;
		Node* next;
	
		Node(int val) : val(val), next(nullptr) {}
	};

	class LLQueue{
	private:
		Node* head;
		Node* tail;

	public:
		LLQueue() : head(nullptr), tail(nullptr) {}

		~LLQueue() {
			while(head != nullptr){
				Node* tmp = head;
				head = head->next;
				delete tmp;
			}
			tail = nullptr;
		}

		bool isEmpty(){
			return head == nullptr;
		}

		void enqueue(int val){
			Node* newNode = new Node(val);

			if(isEmpty()){
				head = tail = newNode;
			} else{
				tail->next = newNode;
				tail = tail->next;
			}
		}

		int dequeue(){
			if(isEmpty()){
				cout<<"Queue is overflowing\n";
				return -1;
			}

			int val = head->val;
			Node* tmp = head;
			head = head->next;
			delete tmp;

			if(head==nullptr) tail=nullptr;
			return val;
		}

		int peek(){
			if(isEmpty()){
				cout<<"Queue is overflowing\n";
				return -1;
			}

			return head->val;
		}

	};


	int main(){
		LLQueue q;
	    q.enqueue(10);
	    q.enqueue(20);
	    q.enqueue(30);
	    cout << "Front element: " << q.peek() << endl;
	    cout << "Dequeue: " << q.dequeue() << endl;
	    cout << "Front element after dequeue: " << q.peek() << endl;

		return 0;
	}	