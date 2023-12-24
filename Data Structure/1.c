#include<conio.h>
#include<stdio.h>
void main()
{
    char stack[]={'a','b','c'};
    char stack2[20];
    int i,j=0;
    for(i=0;i<=4;i++)
    {
        stack2[j]=stack[i];
        j++;
    }
    for(i=2;i>=0;i--)
    {
        printf("%c ",stack[i]);
    }

}