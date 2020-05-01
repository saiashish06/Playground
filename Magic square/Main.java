#include<iostream>
using namespace std;
int main()
{
 int n;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  int n1=0,n2=0;
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
    {
     if(i==j)
       n1+=a[i][j];
      if(i==0)
      n2+=a[i][j];
    }
  if(n1==n2)
    cout<<"Yes";
  else
    cout<<"No";
}