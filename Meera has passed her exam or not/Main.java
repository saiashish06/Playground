#include<iostream>
using namespace std;
int main()
{
 int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
int ele;
  cin>>ele;
  for(int i=0;i<n;i++)
    if(a[i]==ele)
    {
      cout<<"She passed her exam";
      return 0;
    }
  cout<<"She failed";
}