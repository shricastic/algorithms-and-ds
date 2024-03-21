public class LLStack{

    public static class Node{
        int data;
        Node next;

        Node(int val)
        {
            data = val;
            next = null;
        }
    }

    public static Node head;

    public static boolean isEmpty()
    {
        return head == null;
    }

    public void push(int data)
    {
        Node newNode = new Node(data);
        
        if(isEmpty())
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }

        int val = head.data;
        head = head.next;
        return val;
    }

    public void printStack(Node head)
    {
        if(head == null)
        {
            System.out.println("Stack is Empty!");
        }

        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty!");
            return -1;
        }

        return head.data;
    }




    public static void main(String[] args)
    {
        LLStack stack = new LLStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        stack.pop();
        stack.printStack(head);
        
    }
}
