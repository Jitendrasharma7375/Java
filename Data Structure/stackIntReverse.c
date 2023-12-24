#include<stdio.h>
#include<stdlib.h>
int top=-1,capacity;
void traverse(int * stack1)
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
            printf("%d\t",stack1[i]);
       }
    }
}
void push(int *stack1)
{
   if(top==capacity-1)
   {
        printf("Sorry!Stack overflow");
   }
   else
   {
        char item;
        printf("\nEnter character:");
        scanf("%d", &item);
        top++;
        stack1[top]=item;
        printf("Item sucessfully inserted.");
        return;
   }
}
int pop(int *stack1)
{
    int release;
    if(top==-1)
    {
        printf("Sorry!Stack underflow");
        
    }
    else
    {
        release=stack1[top];
        printf("Popped item:%d",release);
        printf("\nItem sucessfully Deleted");
        top--;
        return release;
    }
}
int pop1(int *stack1)
{
    int release;
    if(top==-1)
    {
        printf("Sorry!Stack underflow");
        
    }
    else
    {
        release=stack1[top];
        top--;
        return release;
    }
}
void reverse(int * stack1,int * stack2)
{
    int j;
    j=top;
    if(top==-1)
    {
        printf("Sorry!Stack is empty");
    }
    int n=0;
    for(int i=0;i<=top;)
    {
        stack2[n]=pop1(stack1);
        n++;
    }
    for(int k=j;k>=0;k--)
    {
       printf("%d ",stack2[k]);

    }

}
void main()
{
    int choice;
    int stack1[20];
    int stack2[20];
    printf("Enter the capacity of stack:");
    scanf("%d",&capacity);
    while(1)
    {
        printf("\nPress\n1.Push\n2.Pop\n3.Traverse\n4.reverse\n5.exit\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:push(stack1);
                    break;
            case 2:pop(stack1);
                    break;
            case 3:traverse(stack1);
                    break;
            case 4:reverse(stack1,stack2);
                    break;
            case 5:exit(1);
                    break;
            default:printf("Error!You choose wrong option");

        }
    }
}