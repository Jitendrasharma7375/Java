import java.util.*;
class QNode
{
    int data;
    QNode link;
    public QNode(int data)
    {
        this.data=data;
        this.link=null;
    }
}
class Queue 
{
    QNode front,rear;
    
    public Queue()
    {
        this.front=this.rear=null;
    }
    public void enqueue()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Element:");
        int data=sc.nextInt();
        QNode temp=new QNode(data);
        if(this.rear==null)
        {
            System.out.println("Item Enqueued Sucessfully");
            this.front=this.rear=temp;
            return;
        }
        else
        {
            System.out.println("Item Enqueued Sucessfully");
            this.rear.link=temp;
            this.rear=temp;
        }
    }
    public void dequeue()
    {
        if(this.front==null)
        {
            System.out.println("Sorry!Queue empty");
            return;
        }
        else 
        {
            QNode temp=this.front;
            System.out.println("Item Dequeued Sucessfully");
            System.out.println("Item:"+temp.data);
            front=front.link;
            if(this.front==null)
            {
                this.rear=null;
            }
        }
        
    }
    public void queueTraverse()
        {
        if(this.front==null)
        {
            System.out.println("Sorry!Queue empty");
        }
        else 
        {
            QNode temp=this.front;
            System.out.println("Queue Elements Are:");
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.link;
            }
            System.out.println("\n");
        }

        }
}
public class QueueUsingJava {
    public static void main(String[] args) {
        {
            Queue q1=new Queue();
            
            int choice;
            while(true)
            { 
                Scanner sc=new Scanner(System.in);
                System.out.println("Press\n1.enqueue\n2.dequeue\n3.Queue Traverse\n4.Exit");
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1:q1.enqueue();
                            break;
                    case 2:q1.dequeue();
                            break;
                    case 3:q1.queueTraverse();
                            break;
                    case 4:System.exit(0);
                    default:System.out.println("Invalid Choice");
                }
            }
        }
    }
    
}
