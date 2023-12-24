#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
struct arrayStack
{
    int capacity;
    int top;
    int * stack;
};
struct arrayStack * createStack(int capacity)
{
    struct arrayStack * st;
    st=(struct arrayStack*)malloc(sizeof(struct arrayStack));
    st->capacity=capacity;
    st->top=-1;
    st->stack=(int *)malloc(sizeof(int)* st->capacity);
    return (st);
}
void traverseStack(struct arrayStack * st)
{
    int i;
    if(st->top==-1)
    {
        printf("Sorry! Stack is empty.");
    }
    else
    {
       printf("Stack elements are:\n");
       for(i=st->top;i>=0;i--)
       {
            printf("%d\n",st->stack[i]);
       }
    }
}
void stackPush(struct arrayStack* st)
{
   int item;
   if(st->top==st->capacity-1)
   {
        printf("Sorry!Stack overflow");
   }
   else
   {
        printf("Enter Element:");
        scanf("%d",&item);
        st->top++;
        st->stack[st->top]=item;
        printf("Item sucessfully inserted.");
   }
}
void stackPop(struct arrayStack * st)
{
    int item;
    if(st->top==-1)
    {
        printf("Sorry!Stack underflow");
        return;
    }
    else
    {
        item=st->stack[st->top];
        st->top--;
        printf("Popped item:%d",item);
        printf("\nItem sucessfully Deleted");

    }
}
void main()
{
    struct arrayStack * st;
    int choice,capacity;
    printf("Enter the size of Stack:");
    scanf("%d",&capacity);
    st=createStack(capacity);
    while (1)
    {
    //system("cls");
    printf("\nPress\n1.Stack Push\n2.Stack Pop\n3.Stack Traverse\n4.Exit\nEnter your choice:");
    scanf("%d",&choice);
    switch(choice)
    {
        case 1:stackPush(st);
                break;
        case 2:stackPop(st);
                break;
        case 3:traverseStack(st);
                break;
        case 4:exit(0);
        default:
                printf("You choose a wrong option");
    }
    }

}
