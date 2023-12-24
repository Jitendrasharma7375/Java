#include<iostream>
using namespace std;
int main()
{
    int arr[10];
    cout<<"Enter array size:";
    int n;
    cin>>n;
    cout<<"\nEnter items in array:";
    for(int i=0;i<n;i++)
    {        
        cin>>arr[i];
        cout<<" ";
    }    
    cout<<"\nArray elements are:";
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<"\nArray Elements after sorting:";
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
}