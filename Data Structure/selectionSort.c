#include<stdio.h>
#include<stdlib.h>
void selectionSort(int * arr,int n)
{
    int k,temp,loc;
    for(k=0;k<n-1;k++)
    {
        loc=min(arr,k,n);
        temp=arr[loc];
        arr[loc]=arr[k];
        arr[k]=temp;  
    }
}
int min(int * arr,int k,int n)
{
    int minimum=arr[k];
    int loc=k;
    while(k<n)
    {
        if(minimum>arr[k])
        {
            minimum=arr[k];
            loc=k;
        }
        k++;
    }
    return(loc);
}
void main()
{
    int *arr,n,i;
    printf("Enter Capacity of array:");
    scanf("%d",&n);
    arr=(int *)malloc(sizeof(int)*n);
    printf("\nEnter array elements:");
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);
    printf("Array elements before sorting:");
    for(i=0;i<n;i++)
        printf("%d ",arr[i]);
    selectionSort(arr,n);
    printf("\nArray elements after sorting:");
    for(i=0;i<n;i++)
        printf("%d ",arr[i]);
    
}