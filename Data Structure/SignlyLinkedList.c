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
void insertNode()
{
    struct node * temp;
    temp=createnode();
    if(START==NULL)
    {
        START=temp;
        printf("New Node inserted\n"); 
    }
    else
    {
        temp->next=START;
        START=temp;
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
        while(traverse!=NULL)
        {
            printf("%d",traverse->info);
            printf(" ");
            traverse=traverse->next;
        }
    }
}
void fun(struct node* start)
{
    if(start==NULL)
        return;
    printf("%d ",start->info);
    if(start->next!=NULL)
        fun(start->next->next);
    printf("%d ",start->info);
}
void main()
{
    int choice;
    while(1)
    {
        //system("cls");
        printf("\nPress\n1.Insert node\n2.Traverse Node\n3.Linked list operation\n4.Exit\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:insertNode();
                   break; 
            case 2:traverseNode();
                   break;
            case 3:fun(START);
                    break;
            case 4:exit(0);
            default:printf("You choose wrong option.");
        }

    }
}

