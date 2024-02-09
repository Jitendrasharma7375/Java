import java.util.*;
class Node
{
    int data;
    Node link;
    Node(int data)
    {
        this.data=data;
        this.link=null;
    }
}
class LList
{
    Node head;
    public void insertAtBeginning()
    {
        Scanner List=new Scanner(System.in);
        int data;
        System.out.println("Enter Element:");
        data=List.nextInt();
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            System.out.println("New Element inserted at beginning Sucessfully.");
        }
        else
        {
            Node temp=newNode;
            temp.link=head;
            head=temp;
            System.out.println("New Element inserted at beginning Sucessfully.");
        }
        List.close();
    }
    public void insertAtEnd()
    {
        Scanner List=new Scanner(System.in);
        int data;
        System.out.println("Enter Element:");
        data=List.nextInt();
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else 
        {
            Node temp=head;
            while(temp.link!=null)
            {
                temp=temp.link;
            }
            temp.link=newNode;
            
        }
        List.close();
    }
    public void deleteAtBeginning()
    {
        if(head==null)
        {
            System.out.println("Sorry!List is empty.");

        }
        else
        {
            Node release=head;
            System.out.println("First node deleted sucessfully.");
            System.out.println("Deleted element:"+release.data);
            head=head.link;
        }
    }
    public void deleteAtEnd()
    {
        if(head==null)
        {
            System.out.println("SOrry!Linked List is empty.");
        }
        else 
        {
            Node temp,release;
            temp=head;
            release=temp;
            while(temp.link!=null)
            {
                release=temp;
                temp=temp.link;
            }
            System.out.println("Last node deleted sucessfully.");
            System.out.println("Deleted Element:"+temp.data);
            release.link=null;
        }
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("Sorry!Linked list is empty.");
        }
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.link;
            }
            System.out.println();
        }
    } 
    
}
public class Linkedlist {
    public static void main(String[] args) 
    {     
        Scanner sc=new Scanner(System.in);
        LList l=new LList();
        LList l2=new LList();
        int choice;
        while(true)
        { 
            
            System.out.println("Press\n1.Insert Node At Beginning in list 1.");
            System.out.println("2.Insert Node At Beginning in list 2.");
            System.out.println("3.Insert Node At End in list 1.");
            System.out.println("4.Insert Node At End in list 2.");
            System.out.println("5.Delete Node At Beginning in list 1.");
            System.out.println("6.Delete Node At Beginning in list 2.");
            System.out.println("7.Delete Node At End in list 1.");
            System.out.println("8.Delete Node At End in list 2.");
            System.out.println("9.Display Linked List 1.");
            System.out.println("10.Display Linked List 2.");
            System.out.println("11.Linked list merge.");
            System.out.println("12.exit.");
            choice=sc.nextInt(); 
            switch(choice)
            {
                case 1:l.insertAtBeginning();
                        break;
                case 2:l2.insertAtBeginning();
                        break;
                case 3:l.insertAtEnd();
                        break;
                case 4:l2.insertAtEnd();
                        break;
                case 5:l.deleteAtBeginning();
                        break;
                case 6:l2.deleteAtBeginning();
                        break;
                case 7:l.deleteAtEnd();
                        break;
                case 8:l2.deleteAtEnd();
                        break;
                case 9:l.display();
                        break;
                case 10:l2.display();
                        break;
                case 11:Node head1=l.head;
                        Node head2=l2.head;
                        if(head1==null || head2==null)
                        {
                            System.out.println("Sorry!Linked list empty.");
                            break;
                        }
                        else 
                        {
                            while(head1!=null || head2!=null)
                            {
                                
                                if(head1!=null)
                                {
                                    System.out.print(head1.data+" ");
                                    head1=head1.link;
                                }
                                if(head2!=null)
                                {
                                    System.out.print(head2.data);
                                    head2=head2.link;
                                }
                                System.out.print(" ");
                            }
                            System.out.println();
                            break;
                        }
                case 12: System.exit(1);
                        break;
                default:
                    System.out.println("Sorry!Invalid Choice.");
            }
            sc.close();
        }
        
    }
}
