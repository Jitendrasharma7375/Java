#include<iostream>
using namespace std;

int main()
{
    int i,arr[20],n,j;
    cout<<"Enter the size of array:->";
    cin>>n;
    cout<<"\nEnter the value in array:->";
    for ( i = 0; i < n; i++)
        {
        cin>>arr[i];
        }
    cout<<"\nValues in array:->";
    for ( i = 0; i < n; i++)
        {
        cout<<arr[i]<<" ";
        }  
      
    j=arr[0];
    for(i=0;i<n;i++)
        {
        if(j<=arr[i])
            {
            j=arr[i];
            }
        }
    cout<<"\nBiggest value in array:->"<<j;
    bubble(arr,n);
    cout<<"\nValues in array:->";
    for ( i = 0; i < n; i++)
        {
        cout<<arr[i]<<" ";
        }  
      
}
void bubble(int arr[],int n)
{
    int i,j;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-i;j++)
        {
            if(arr[j]>arr[j=1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
   