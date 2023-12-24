#include<iostream>
using namespace std;
int main()
{
    int arr[10];
    int mid,lb,ub,flag=-1;
    cout<<"Enter array size:";
    int n;
    cin>>n;
    cout<<"\nEnter items in array:";
    for(int i=0;i<n;i++)
    {        
        cin>>arr[i];

    }    
    cout<<"Array elements are:";
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    lb=0;
    ub=n-1;
    cout<<"\nEnter item to search:";
    int item;
    cin>>item;
    //cout<<mid;
    for(int i=0;i<=n;i++)
    {
        mid=(lb+ub)/2;
        if(item==arr[mid])
        {
            flag=mid;
        }
        else if(item>arr[mid])
        {
            lb=mid+1;
        }
        else
        {
            ub=mid-1;
        }
    }
    if(flag==-1)
        cout<<"Item not found";
    else
        cout<<"Item found at "<<flag+1<<"th position"; 
}