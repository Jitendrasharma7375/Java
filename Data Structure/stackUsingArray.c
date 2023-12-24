#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
int top=-1;
int capacity;
void traverseStack(int * stack)
{
    int i;
    if(top==-1)
    {
        printf("Sorry! Stack is empty.");
    }
    else
    {
       printf("Stack elements are:\n");
       for(i=top;i>=0;i--)
       {
            printf("%d\t",stack[i]);
       }
    }
}
void stackPush(int * stack)
{
   int item;
   if(top==capacity-1)
   {
        printf("Sorry!Stack overflow");
   }
   else
   {
        printf("Enter Element:");
        scanf("%d",&item);
        top++;
        stack[top]=item;
        printf("Item sucessfully inserted.");
   }
}
void stackPop(int *stack)
{
    int release;
    if(top==-1)
    {
        printf("Sorry!Stack underflow");
    }
    else
    {
        release=stack[top];
        printf("Popped item:%d",release);
        printf("\nItem sucessfully Deleted");
        top--;
    }
}
void Operation(int * stack)
{
    if(top==-1)
    {
        printf("Sorry!Stack is empty.");
        return;
    }
    else 
    {
        int min=stack[top];
        int count=top;
        for(int i=top-1;i>=0;i--)
        {
            if(stack[i]<min)
            {
                min=stack[i];
                count=i;
            }
           
        } 
        int temp=stack[count];
        for(int i=count;i<top;i++)
        {
            stack[i]=stack[i+1];
        }
        stack[top]=temp;
        printf("Minimum element:%d\nMoved to the top\n",min);
        traverseStack(stack);
    }
}
void main()
{
    int choice;
    int stack[100];
    printf("Enter the size of Stack:");
    scanf("%d",&capacity);
    while (1)
    {
    //system("cls");
    printf("\nPress\n1.Stack Push\n2.Stack Pop\n3.Stack Traverse\n4.Operation\n5.exit\nEnter your choice:");
    scanf("%d",&choice);
    switch(choice)
    {
        case 1:stackPush(stack);
                break;
        case 2:stackPop(stack);
                break;
        case 3:traverseStack(stack);
                break;
        case 4:Operation(stack);
                break;
        case 5:exit(0);
        default:printf("You choose a wrong option");
    }
    }
    
}
