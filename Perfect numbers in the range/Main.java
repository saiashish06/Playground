#include<iostream>
using namespace std;
int perfect(int n)
{
  int i,Sum=0;
 for(i = 1 ; i < n ; i++)   
  {   
   if(n % i == 0)   
     Sum = Sum + i ;   
  }    

 if (Sum == n)   
return 1;
  return 0;
}
int main()
{
  int a,b;
  cin>>a>>b;
  for(int i=a;i<=b;i++)
  {
    if(perfect(i))
      cout<<i<<" ";
  }
}
    