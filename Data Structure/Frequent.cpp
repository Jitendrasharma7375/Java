#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

void frequency(int arr[],int k,int n) 
{
    sort(arr,arr+n);
    vector<int> freq;   
    int count=1; 
    for (int i=1;i<n;i++)
    {
        if (arr[i]==arr[i-1]) 
        {
            count++;
        } 
        
        else
        {
            if(count>=k) 
            {
                freq.push_back(arr[i-1]);
            }
            count=1;
        }
    }
    if(count>=k) 
    {
        freq.push_back(arr[n-1]);
    }

    for(int i=0;i<freq.size();i++) 
    {
        cout<<freq[i]<< "\n";
    }
}

int main() 
{
    int arr[]={1,1,1,2,2,3};
    int k=2;
    int n=sizeof(arr)/sizeof(arr[0]);
    frequency(arr,k,n);
    return 0;
}
