#include<stdio.h>
#include<stdlib.h>
void insertionSort(int * arr,int n)
{
    int temp,j,i;
    for(i=0;i<n;i++)
    {
        temp=arr[i];
        j=i-1;
        while(j>=0 &&temp<arr[j])
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;

    }
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
    insertionSort(arr,n);
    printf("\nArray elements after sorting:");
    for(i=0;i<n;i++)
        printf("%d ",arr[i]);
    
}