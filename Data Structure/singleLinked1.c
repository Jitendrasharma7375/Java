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
struct node *insertSpecifiedPosition()
{
    struct node* temp,*traverse;
    int count=0,pos;
    if(START==NULL)
    {
       insertNodeEnd();
       printf("\nNumber of node less than 2");
    }
    else
    {
        traverse=START;
        while(traverse!=NULL)
        {
            count++;
            traverse=traverse->next;
        }
        if(count<2)
        {
            insertNodeEnd();
            printf("\nNo. of nodes are leff than 2:\n");
        }
        if(count>=2)
        {
            printf("\nEnter new node Position between 2 to %d",count);
            scanf("%d",&pos);
            if(pos<=1 || pos>count)
            {
                printf("Sorry!Invalid position.Specified position insertion not possible.");
            }
            else 
            temp=createnode();
            traverse=START;
            for(int i=1;i<pos;i++)
            {
                traverse=traverse->next;
            }
            temp->next=traverse->next;
            traverse->next=temp;
            printf("Node Sucessfully inserted at the specified position.");
        }
    }
    
}
struct node * insertNodeBeginning()
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
struct node * insertNodeEnd()
{
    struct node * temp;
    
    if(START==NULL)
    {
        temp=insertNodeBeginning();
    }
    else
    {
        temp=START;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }

            temp->next=createnode();
            printf("New element inserted at end sucessfully");
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
            printf("%d->",traverse->info);
            //printf(" ");
            traverse=traverse->next;
        }
        printf("NULL");
    }
}
struct node * deleteNodeBeginning()
{
    struct node * release;
    if(START==NULL)
    {
        printf("No element in the linked list");
    }
    else
    {
        release=START;
        printf("First element deleted sucessfully.");
        START=START->next;
        free(release);
    }
}
struct node * deleteNodeEnd()
{
    struct node * release;
    struct node * traverse;
    if(START==NULL)
    {
        printf("NO Element if linked list");
    }
    else
    {
        release=START;
        while(release->next!=NULL)
        {
            traverse=release;
            release=release->next;
            

        }
        printf("Last Element deleted sucessfully");
        free(release);
        traverse->next=NULL;
    }
}

void main()
{
    int choice;
    while(1)
    {
       // system("cls");
        printf("\nPress\n1.Insert node Beginning\n2.Insert Node End\n3.insertSpecifiedPosition \n4.Traverse Node\n5.Delete node beginning\n6.Delete Node End\n");
        printf("7.exit\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: insertNodeBeginning();
                    break;
            case 2: insertNodeEnd();
                    break;
            case 3:insertSpecifiedPosition();
                    break;
            case 4: traverseNode();
                    break;
            case 5:deleteNodeBeginning();
                    break;
            case 6:deleteNodeEnd();
                    break;
            case 7:exit(0);
            default:printf("You choose wrong option.");
        }

    }
}

