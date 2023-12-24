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
    cout<<"\nEnter item position:";
    cin>>k;
    int Item;
    cout<<"Enter item :";
    cin>>Item;
    if(k>=0 && k<n)
    {
        for(int j=n-1;j>=k;j--)
        {
            arr[j+1]=arr[j];
        }
        arr[k]=Item;
    }
    else
        cout<<"Item position doesn't match";
    cout<<"\nArray after insertion:";
     for(int i=0;i<=n;i++)
    {
        cout<<arr[i]<<" ";
    }
    
  
}
