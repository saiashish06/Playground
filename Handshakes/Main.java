#include<iostream>
using namespace std;
int main()
{
  int n,count=0;
  cin>>n;
  for(int i=0;i<n;i++)
    for(int j=i+1;j<n;j++)
      count++;
  cout<<count;
}