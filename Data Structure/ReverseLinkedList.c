#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int info;
    struct node *next;
};
struct node * START=NULL;
struct node * createnode()
{
    struct node * n;
    n=(struct node *)malloc(sizeof(struct node));
    printf("Enter Element:");
    scanf("%d",&n->info);
    n->next=NULL;
    return n;
}
void insertLast()
{
    struct node * temp,*t;
    temp=createnode();
    if(START==NULL)
    {
        START=temp;
        printf("New Node inserted\n"); 
    }
    else
    {
        t=START;
        while(t->next!=NULL)
        {
            t=t->next;
        }
        t->next=temp;
        printf("New Node inserted\n");
    }
}

void traverseNode()
{
    struct node * traverse;
    if(START==NULL)
    {
        printf("Linked list is empty\n");
    }
    else
    {
        traverse=START;
        struct node*temp=START;
        while(temp!=NULL)
        {
            printf("%d",temp->info);
            printf(" ");
            temp=temp->next;
        }
    }
}
void printReverse(struct node* start)
{
    if(start==NULL)
        return;
    printReverse(start->next);
    printf("%d ",start->info);
}

void main()
{
    int choice;
    while(1)
    {
        //system("cls");
        printf("\nPress\n1.Insert node\n2.Traverse Node\n3.Reverse traverse\n4.Exit\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:insertLast();
                   break; 
            case 2:traverseNode();
                   break;
            case 3:printReverse(START);
                   break;
            case 4:exit(0);
            default:printf("You choose wrong option.");
        }

    }
}

