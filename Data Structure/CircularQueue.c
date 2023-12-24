#include<stdio.h>
#include<stdlib.h>
int capacity;
int front=-1;
int rear=-1;
void enqueue(int * cirQueue)
{
    int item;
    if((rear+1)%capacity==front)
    {
        printf("\nQueue overflow");
    }
    else
    {
        printf("\nEnter Queue item:");
        scanf("%d",&item);
        rear=(rear+1)%capacity;
        cirQueue[rear]=item;
        if(front==-1)
        {
            front++;
        }
        printf("\nItem sucessfully Enqueued.");

    }
}
void dequeue(int * cirQueue)
{
    int temp;
    if(front==-1)
    {
        printf("\nQueue underflow");
    }
    else
    temp=cirQueue[front];
    printf("\nItem dequeued Sucessfully.");
    printf("\nDequeued item:%d",temp);
    if(front==rear)
    {
        front=rear=-1;
    }
    else
    {
        front=(front+1)%capacity;
    }
}
void traverse(int * cirQueue)
{
    int temp;
    if(front==-1)
    {
        printf("Sorry!Queue empty");
    }
    else 
    {
        printf("Queue elements are: ");
        if(rear<front)
        {
            for(temp=front;temp<capacity;temp++)
            {
                printf("%d ",cirQueue[temp]);
            }
            for(temp=0;temp<=rear;temp++)
            {
                printf("%d ",cirQueue[temp]);
            }
        }
        else 
        {
            for(temp=front;temp<=rear;temp++)
            {
                printf("%d ",cirQueue[temp]);
            }
        }
    }
}
void queueStatus(int * cirQueue)
{
    int status;
    if(front==-1)
    {
        printf("\nQueue empty");
    }
    else
    {
        status=(capacity-front+rear)%capacity+1;
        printf("\nQueue status:%d",status);
    }
}
void main()
{
    int choice;
    int cirQueue[20];
    printf("Enter capacity:");
    scanf("%d",&capacity);
    while(1)
    {
        printf("\nPress\n1.enqueue\n2.dequeue\n3.Queue Traverse\n4.Queue Status\n5.exit\n");
        scanf("%d",&choice);
        switch(choice)
            {
                case 1:enqueue(cirQueue);
                        break;
                case 2:dequeue(cirQueue);
                        break;
                case 3:traverse(cirQueue);
                        break;
                case 4:queueStatus(cirQueue);
                        break;
                case 5:exit(0);
                default:printf("Invalid Choice");
            }
    }
}