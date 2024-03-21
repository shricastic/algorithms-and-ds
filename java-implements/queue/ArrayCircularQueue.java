import java.util.Arrays;

class ArrayCircularQueue{
    static class CircularQueue{
        static int[] arr;
        static int front;
        static int rear;
        static int size;

        CircularQueue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }


        public static void add(int data){
            if((isFull())){
                System.out.println("Queue is Full!");
                return;
            }  
            
            if(front==-1)
            {
                front = 0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;

            return;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            
            int value = arr[front];
            front = (front+1)%size;
            
            if(rear==front){
                rear=front=-1;
            }
            return value;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return front;
        }
    }

    public static void main(String[] args) {
        CircularQueue c = new CircularQueue(5);
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.remove();
        c.add(6);
        System.out.println(Arrays.toString(c.arr));
    
    
    }
}