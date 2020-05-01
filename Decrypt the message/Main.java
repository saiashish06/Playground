#include<iostream>
using namespace std;
int main()
{
  int a,b,n,sum=0;
  cin>>a>>b;
  n=a+b;
 int i=1;
  while(i<n)
  {
    if(n%i==0)
   sum+= i;
    i++;
  }
  if(sum==a+b)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}