import java.util.LinkedList;
import java.util.Queue;

public class StackByQueue {
    
    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new LinkedList<>();

    public void push(int data){
        if(queue1.isEmpty() && queue2.isEmpty()){
            queue1.add(data);
        }
        else if(!queue1.isEmpty()){
            queue1.add(data);
        }
        else{
            queue2.add(data);
        }
        return;
    }



    public int pop(){
        if(queue1.isEmpty() && queue2.isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }
        else if(!queue1.isEmpty()){
           
        
        }
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
