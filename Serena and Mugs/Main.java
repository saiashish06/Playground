#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  int c=0,temp;
  for(int i=0;i<a;i++)
  {
    cin>>temp;
    c+=temp;
  }
  if(c<=b)
    cout<<"YES";
  else
    cout<<"NO";
    
    
}