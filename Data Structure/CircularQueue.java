public class CircularQueue {
    int front,rear;
    int queue[];
    int capacity;   
    CircularQueue(int capacity)
    {
        front=rear=-1;
        this.capacity=capacity;
        queue=new int[capacity];
    }
    public void enQueue(int data)
    {
        if((rear+1)%capacity==front)
        {
            System.out.println("Sorry! Queue overflow");
        }
        else 
        {
            rear=(rear+1)%capacity;
            queue[rear]=data;
            System.out.println("New Node Enqueued");
            if(front==-1)
            {
                front=rear;
            }
        }
    }
    public void deQueue()
    {
        if(front==-1)
        {
            System.out.println("Sorry! Queue underflow");
        }
        else 
        {
            int data=queue[front];
            front=(front+1)%capacity;
            System.out.println("Dequeued Node is "+data);
            if(front==rear)
            {
                front=rear=-1;
            }
        }
    }
    public void traverse()
    {
        if(front==-1)
        {
            System.out.println("Sorry! Queue underflow");
        }
        else 
        {
            int i=front;
            while(i!=rear)
            {
                System.out.print(queue[i]+" ");
                i=(i+1)%capacity;
            }
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        CircularQueue queue=new CircularQueue(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.traverse();
        queue.deQueue();
        queue.traverse();
        queue.deQueue();
        queue.traverse();
        queue.deQueue();
        queue.traverse();
    }
}
