#include<iostream>
using namespace std;
int digit(int n)
{
  int a=0;
  while(n!=0)
  {
    a+=n%10;
    n/=10;
  }
  if(a/10==0)
    return a;
  return digit(a);
}
int main()
{
  int n;
  cin>>n;
  cout<<digit(n);
}