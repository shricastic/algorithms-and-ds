import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int current = s.pop();
        pushAtBottom(s, data);
        s.push(current);
        return;
    }


    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(stack, 4);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }
    
}
