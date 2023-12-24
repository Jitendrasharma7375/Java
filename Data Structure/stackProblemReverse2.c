#include<stdio.h>
#include<stdlib.h>
int top=-1,capacity;
void traverse(char * stack1)
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
            printf("%c\t",stack1[i]);
       }
    }
}
void push(char *stack1)
{
   if(top==capacity-1)
   {
        printf("Sorry!Stack overflow");
   }
   else
   {
        char item;
        printf("\nEnter character:");
        scanf("%c\n", &item);
        top++;
        stack1[top]=item;
        printf("Item sucessfully inserted.");
        return;
   }
}
char pop(char *stack1)
{
    char release;
    if(top==-1)
    {
        printf("Sorry!Stack underflow");
        return '\0';
    }
    else
    {
        release=stack1[top];
        printf("Popped item:%c",release);
        printf("\nItem sucessfully Deleted");
        top--;
        return release;
    }
}
void reverse(char * stack1,char * stack2)
{
    int i;
    if(top==-1)
    {
        printf("Sorry!Stack is empty");
    }
    for(i=0;i<=top;i++)
    {
        stack2[i]=pop(stack1);
    }
    for(i=0;i<=top;i++)
    {
       printf("%c",&stack2[i]);
    }

}
void main()
{
    int choice;
    char stack1[20];
    char stack2[20];
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