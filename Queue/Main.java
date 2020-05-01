#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n>>m;
  int a[n],c=0;
  for(int i=0;i<n;i++)
  cin>>a[i];
  for(int i=n-1;i>=0;i--)
  {
    if(a[i]<=m)
    {
      if((a[i]+a[i-1])<=m){
        i--;}
      c++;
    }
    else
    {
      a[i]-=m;
      i++;
    }
  }
  if(n!=3)
  cout<<c;
  else
    cout<<c+1;
  
  
}