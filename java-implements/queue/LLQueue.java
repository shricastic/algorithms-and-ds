public class LLQueue {
    
    public class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static Node front;
    public static Node rear;

    public void add(int data){
        Node newNode = new Node(data);
        if(front == null){
            rear = front = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        return;
    }
    
    public int remove(){
        if(front == null){
            System.out.println("Queue is Empty!");
            return -1;
        }

        int val = front.data;
        front = front.next;
        return val;
    }

    public int peek(){
        if(front==null){
            System.out.println("Queue is Empty!");
            return -1;
        }
        return front.data;
    }

    public void printQueue(Node front){
        if(front==null){
            System.out.println("Queue is Empty!");
            return;
        }

        while(front!=null){
            System.out.print(front.data+" ");
            front = front.next;
        }
        
    }

    public static void main(String[] args) {
        LLQueue a = new LLQueue();
        a.add(1);
        a.add(2);
        a.add(3);
        a.remove();
        a.remove();
        a.remove();
        // a.printQueue();
        System.out.println(a.peek());        
    }
}
