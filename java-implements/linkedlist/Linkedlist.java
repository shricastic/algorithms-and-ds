class Linkedlist {

    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //to add new node at first if new node
    public void addFirst(int data)
    {
        //creation of new node
        Node newNode = new Node(data);
        size++;
        //if linkedlist is empty then head==tail==newNode
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        //assign value of head to newNode.next
        newNode.next=head;
        //point head to newNode
        head=newNode;
    }

    public void addLast(int data)
    {
        //create new node
        Node newNode= new Node(data);
        size++;
        
        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        //assign the value of tail.next to newNode
        tail.next=newNode;
        //assign newNode as new tail 
        tail = newNode;
    }

    public void printNode(Node temp)
    {

        if(head==null)
        {
            System.out.println("The LinkedList is Empty!");
        }

        if(temp.next==null)
        {
            System.out.print(temp.data+"->Null");
            return;
        }

        //print data part of linkedlist
        System.out.print(temp.data+"->");

        printNode(temp.next);
    }

    public void insert(int index, int data)
    {
        //when index is 0
        if(head==null)
        {
            addFirst(data);
            size++;
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int count = 0;

        while(count<index-1)
        {
            temp=temp.next;
            count++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst()
    {
        if(head==null)
        {
            System.out.println("Linked list is Empty!");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int value = head.data;
            head=tail=null;
            size=0;
            return value;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast()
    {
        if (size==0)
        {
            System.out.println("Linkedlist is empty!");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val = head.data;
            head=tail=null;
            size=0;
            return val;     
        }

        Node temp = head;
        int count = 0;

        while(count<size-2)
        {
            temp = temp.next;
            count++;
        }
        
        int val = temp.next.data;
        temp.next=null;
        size--;
        tail=temp;
        return val;
    }

    public int searchData(int data)
    {           
        Node temp = head;
        int count = 1;

        while(temp != null)
        {
            if(temp.data == data)
            {
                return count;
            }
            temp = temp.next;
            count++;
        }

        System.out.println("Data not found!");
        return -1;
    }

    public int helper(int data, Node head)
    {
        if(head==null)
        {
            return -1;
        }
        
        if(head.data==data)
        {
            return 0;
        }
        
        int index= helper(data, head.next);
        
        if(index==-1)
        {
            return -1;
        }

        return index+1;
    }

    public int recursiveSearch(int data, Node head)
    {
        return helper(data, head);  
    }

    public void reverseList()
    {
        Node previous=null;
        Node current=tail=head;
        Node next;
        
        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        head = previous;
    }

    public int removeFromEnd(int i)
    {
        if(head==null)
        {
            System.out.println("Linked list is Empty!");
            return -1;
        }
        else if(size-i-1<0)
        {
            System.out.println("Index given is greater than list size!");
            return -1;
        }

        Node current = head;
        int index = 0;

        while(index < size-i-1)
        {
            current = current.next;
            index++;
        }

        Node temp = current.next;
        current.next = temp.next;
        temp.next = null;
        size--;
        return temp.data;

    }

    public Node findMid(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public static void checkPalindrome(Linkedlist ll)
    {
        // Node prev = null;
        // Node current = ll.findMid(head);
        // Node next = ll.findMid(head).next;

        
        

    }

    public boolean isCycle()
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args)
    {   
        Linkedlist ll = new Linkedlist();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(5);
        ll.insert(2, 3);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        //System.out.println(ll.recursiveSearch(5, head));
        //ll.reverseList();
        ll.printNode(head);
        ll.removeFromEnd(3);
        System.out.println();
        ll.printNode(head);

        
    }
    
    
    
}
