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
    int k;
    cout<<"\nEnter deleting position:";
    cin>>k;
    if(k>=0 && k<n)
    {
        for(int j=k;j<n;j++)
        {
            arr[k]=arr[k+1];
        }
        //arr[k]=Item;
    }
    cout<<"\nArray after deletion:";
     for(int i=0;i<n-1;i++)
    {
        cout<<arr[i]<<" ";
    }
    
  
}