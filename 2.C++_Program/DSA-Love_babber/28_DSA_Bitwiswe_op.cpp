// Bitwise operator 
#include<iostream> 
using namespace std; 
int main() 
{ 
    int a = 4 , b = 6 ;
    cout<<a<<" & "<<b<<" = "<<(a&b)<<endl;
    cout<<a<<" | "<<b<<" = "<<(a|b)<<endl;
    cout<<a<<" ^ "<<b<<" = "<<(a^b)<<endl;
    cout<<"~ "<<a<<" = "<<(~a)<<endl;

    cout<<endl;
    a = -12 , b = 6 ;
    cout<<a<<" & "<<b<<" = "<<(a&b)<<endl;
    cout<<a<<" | "<<b<<" = "<<(a|b)<<endl;
    cout<<a<<" ^ "<<b<<" = "<<(a^b)<<endl;
    cout<<"~ "<<a<<" = "<<(~a)<<endl;
  
    return 0 ;
}