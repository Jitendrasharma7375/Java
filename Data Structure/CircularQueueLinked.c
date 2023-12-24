#include<stdio.h>
#include<stdlib.h>
struct cirQueue
{
        int front;
        int rear;
        int capacity;
        int * queue;
};
struct cirQueue * createQueue(int capacity)
{
    struct cirQueue * cq;
    cq=(struct cirQueue *)malloc(sizeof(struct cirQueue));
    cq->front=-1;
    cq->rear=-1;
    cq->capacity=capacity;
    cq->queue=(int *)malloc(sizeof(int)*cq->capacity);
    return cq;
}
void enqueue(struct cirQueue * cq)
{
    int item;
    if((cq->rear+1)%cq->capacity==cq->front)
    {
        printf("\nQueue overflow");
    }
    else
    {
        printf("\nEnter Queue item:");
        scanf("%d",&item);
        cq->rear=(cq->rear+1)%cq->capacity;
        cq->queue[cq->rear]=item;
        if(cq->front==-1)
        {
            cq->front++;
        }
        printf("\nItem sucessfully Enqueued.");

    }
}
void dequeue(struct cirQueue * cq)
{
    int temp;
    if(cq->front==-1)
    {
        printf("\nQueue underflow");
    }
    else
    temp=cq->queue[cq->front];
    printf("\nItem dequeued Sucessfully.");
    printf("\nDequeued item:%d",temp);
    if(cq->front==cq->rear)
    {
        cq->front=cq->rear=-1;
    }
    else
    {
        cq->front=(cq->front+1)%cq->capacity;
    }
}
void traverse(struct cirQueue * cq)
{
    int temp;
    if(cq->front==-1)
    {
        printf("Sorry!Queue empty");
    }
    else 
    {
        printf("Queue elements are: ");
        if(cq->rear<cq->front)
        {
            for(temp=cq->front;temp<cq->capacity;temp++)
            {
                printf("%d ",cq->queue[temp]);
            }
            for(temp=0;temp<=cq->rear;temp++)
            {
                printf("%d ",cq->queue[temp]);
            }
        }
        else 
        {
            for(temp=cq->front;temp<=cq->rear;temp++)
            {
                printf("%d ",cq->queue[temp]);
            }
        }
    }
}
void queueStatus(struct cirQueue * cq)
{
    int status;
    if(cq->front==-1)
    {
        printf("\nQueue empty");
    }
    else
    {
        status=(cq->capacity-cq->front+cq->rear)%cq->capacity+1;
        printf("\nQueue status:%d",status);
    }
}
void main()
{
    int choice,capacity;
    struct cirQueue * cq;
    printf("Enter capacity:");
    scanf("%d",&capacity);
    cq=createQueue(capacity);
    while(1)
    {
        printf("\nPress\n1.enqueue\n2.dequeue\n3.Queue Traverse\n4.Queue Status\n5.exit\n");
        scanf("%d",&choice);
        switch(choice)
            {
                case 1:enqueue(cq);
                        break;
                case 2:dequeue(cq);
                        break;
                case 3:traverse(cq);
                        break;
                case 4:queueStatus(cq);
                        break;
                case 5:exit(0);
                default:printf("Invalid Choice");
            }
    }
}