#include<stdio.h>
#include<stdlib.h>
int front=-1;
int rear=-1;
int capacity;
void enqueue(int * queue)
{
    int item;
    if(rear==capacity-1)
    {
        printf("\nSorry!Queue oveerflow\n");
    }
    else
    {
        printf("\nEnter element:");
        scanf("%d",&item);
        rear++;
        queue[rear]=item;
        if(front==-1)
        {
            front++;
        }
    printf("\nElement sucessfully inserted.");
    }
}
void dequeue(int * queue)
{
    int item;
    if(front==-1)
    {
        printf("\nSorry!Queue underflow");
    }
    else
    {
        item=queue[front];
        if(front==rear)
        {
            front=rear=-1;
        }
        else
        {
            front++;
            printf("\nElement deleted sucessfully.");
            printf("\nDeleted Element:%d",item);
        }

    }
}
void traverseQueue(int * queue)
{
    int i;
    if(front==-1)
    {
        printf("\nSorry|Queue is empty.");
    }
    else
    {
        printf("\nQueue elements are:");
        for(i=front;i<=rear;i++)
        {
            printf(" %d\t",queue[i]);
        }
    }
}
void main()
{
    int queue[100];
    int i,choice;
    printf("Enter the capacity of queue:");
    scanf("%d",&capacity);
    while(1)
    {
        printf("\nPress\n1.Enqueue\n2.Dequeue\n3.Queue Traverse\n4.Exit\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: enqueue(queue);
                    break;
            case 2: dequeue(queue);
                    break;
            case 3: traverseQueue(queue);
                    break;
            case 4: exit(0);
            default:printf("Sorry! Invalid choice.");
        }
    }
}
