import java.util.Arrays;

class ArrayQueue {

    static class Queue{
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //Enqueue function
        public static void add(int data){
            if(rear == size-1){
                System.err.println("Queue is full!");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        //Dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }

            int front = arr[0];
            for(int i= 0; i<rear; i++){
                arr[i]=arr[i+1];
            }
            rear = rear-1;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[0];
        }

    }


    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(Arrays.toString(q.arr));
        q.remove();
        System.out.println(Arrays.toString(q.arr));

    }
}