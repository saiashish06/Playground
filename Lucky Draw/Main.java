#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  if(n==1)
  {
    cout<<"Not eligible";return 0;}
  for(int i=2;i*i<=n;i++)
    if(n%i==0)
    {
      cout<<"Not eligible";
      return 0;
    }
  cout<<"Eligible";
  return 0;
}