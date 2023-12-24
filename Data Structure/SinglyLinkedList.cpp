#include<iostream>
using namespace std;
class node
{
    public:
    node * next;
    int info;
    node()
    {

    }
    node(int info)
    {
        this->info=info;
        next= NULL;
    }
};
class linkedList
{
    node * head;
    public:
    linkedList()
    {
        head=NULL;
    }
    void insertBeginning(int);
    void printList();
    void deleteFirst();
};
void linkedList::insertBeginning(int info)
{
    node *newNode=new node(info);
    if(head==NULL)
    {
        head=newNode;
        cout<<"New Node Inserted at Beginning";
        return;
    }
    else
    {
        node * temp=newNode;
        temp->next=head;
        head=temp;
        cout<<"\nNew Node Inserted at Beginning";
     }
}
void linkedList::printList()
{
    node * temp=head;
    if(temp==NULL)
    {
        cout<<"\nLinked List is empty"<<endl;
        return;
    }
    else
    {   cout<<endl;
        while(temp!=NULL)
        {
            cout<<temp->info<<" ";
            temp=temp->next;
            
        }
    }
}
void linkedList::deleteFirst()
{
    node * temp=head;
    node * release;
    if(temp==NULL)
    {
        cout<<"\nLinked List is empty";
    }
    else
    {
        release=head;
        cout<<"\nFirst Node deleted.";
        cout<<"\nDeleted Node:"<<release->info;
        head=head->next;
        delete(release);
    }
}
int main()
{
    linkedList list;
    list.insertBeginning(10);
    list.insertBeginning(20);
    list.printList();
    list.deleteFirst();
    list.printList();
    list.insertBeginning(30);
    list.insertBeginning(40);
    list.printList();
    list.deleteFirst();
    return 0;
}