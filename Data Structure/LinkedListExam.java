class Node 
{
    int data;
    Node next,prev;
    Node(int data)
    {
        this.data=data;
        next=prev=null;
    }
}
class LinkedList 
{
    Node head;
    LinkedList()
    {
        head=null;
    }
    public void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            head.next=head;
            head.prev=head;
            System.out.println("New Node Inserted");
        }
        else 
        {
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=newNode;
            temp=newNode;
            temp.next=head;
            head.prev=temp;
            System.out.println("New Node Inserted");
        }
    }
    public void deleteAtFirst()
    {
        if(head==null)
        {
            System.out.println("Sorry! List is empty");
        }
        else 
        {
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            head=head.next;
            head.prev=temp;
            temp.next=head;
            System.out.println("Node Deleted");
        }
    }
    public void deleteAtLast()
    {
        if(head==null)
        {
            System.out.println("Sorry! List is empty");
        }
        else 
        {
            Node temp=head;
            while(temp.next.next!=head)
            {
                temp=temp.next;
            }
            temp.next=head;
            head.prev=temp;
            System.out.println("Node Deleted");
        }
    }
    public void traverse()
    {
        if(head==null)
        {
            System.out.println("Sorry! List is empty");
        }
        else 
        {
            Node temp=head;
            while(temp.next!=head)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
}
public class LinkedListExam {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.deleteAtFirst();
    }
}
