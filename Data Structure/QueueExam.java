class Node 
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
class Queue 
{
    private Node rear,front;
    Queue()
    {
        rear=front=null;
    }
    public void enQueue(int data)
    {
        
            Node newNode=new Node(data);
            if(front==null)
            {
                front=rear=newNode;
            }
            else 
            {
                rear.next=newNode;
                rear=newNode;
                System.out.println("New Node Enqueued");
            }
        
    }
    public void deque()
    {
        if(isEmpty())
        {
            System.out.println("Sorry! Queue underflow");
        }
        else 
        {
            int data=front.data;
            front=front.next;
            System.out.println("Dequeued Node is "+data);
            if(front==null)
            {
                rear=null;
            }
        }
    }
    public void traverse()
    {
        if(isEmpty())
        {
            System.out.println("Sorry/! Queue underflow");
        }
        else 
        {
            Node temp=front;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public boolean isEmpty()
    {
        return front==null;
    }
}
public class QueueExam {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.traverse();
        queue.deque();
        queue.traverse();
        queue.deque();
        queue.traverse();
    }
}
