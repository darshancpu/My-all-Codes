// Returning  address from the funciton
#include<iostream> 
using namespace std; 
int *fun (int size)
{
    int *p = new int[size];
    // the array is created in the heap 
    for(int i = 0 ; i< size ;i++)
    {
        p[i]=i+1;
    }
    return p ;
}
int main() 
{ 
    int *ptr = fun(5);
    for(int i = 0 ; i< 5 ; i++)
    {
        cout<<ptr[i]<<" ";
    }
  
    return 0 ;
}