#include<iostream>
using namespace std;
int main()
{
    int arr1[10];
    int arr2[10];
    int arr3[20];
    cout<<"Enter array 1 size:";
    int n,m;
    cin>>n;
    cout<<"\nEnter items in array 1:";
    for(int i=0;i<n;i++)
    {        
        cin>>arr1[i];
        cout<<" ";
    }    
    cout<<"\nArray 1 elements are:";
    for(int i=0;i<n;i++)
    {
        cout<<arr1[i]<<" ";
    }
    cout<<"Enter array 2 size:";
    int k;
    cin>>k;
    cout<<"\nEnter items in array 2:";
    for(int i=0;i<k;i++)
    {        
        cin>>arr2[i];
        cout<<" ";
    }    
    cout<<"\nArray 1 elements are:";
    for(int i=0;i<k;i++)
    {
        cout<<arr2[i]<<" ";
    }
    int size=n+k;
    cout<<"Array after merging:";
    for(int i=0 ,m=k;m<size && i<k ;i++,m++)
    {
        arr3[m]=
    }
}