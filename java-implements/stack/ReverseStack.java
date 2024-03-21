import java.util.Stack;

public class ReverseStack {
    
    public Stack<Integer> reverseStack(Stack<Integer> stack)
    {
        Stack<Integer> s = new Stack<Integer>();
        
        while(stack.isEmpty()!=true)
        {
            s.push(stack.pop());
        }
        return s;
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>(); 
        stack.push(1);
        stack.push(2);
        stack.push(3);

        ReverseStack r = new ReverseStack();
        stack=r.reverseStack(stack);

        System.out.println(stack.peek());

    }
}
