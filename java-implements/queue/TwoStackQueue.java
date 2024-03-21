import java.util.Stack;

class TwoStackQueue {
    
    public static Stack<Integer> stack1 = new Stack<>();
    public static Stack<Integer> stack2 = new Stack<>();


    public static boolean isEmpty(){
        return stack1.isEmpty();
    }
    public void add(int data){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        stack1.push(data);
        
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
    
    public int remove(){
        if(stack1.isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }

        return stack1.pop();
    }

    public int peek(){
        return stack1.peek();
    }

    public static void main(String[] args) {
        TwoStackQueue t = new TwoStackQueue();
        t.add(1);
        t.add(2);
        t.add(3);
        
        t.remove();
        System.out.println(stack1.toString());
        
    }
}
