#include<iostream>
using namespace std;
int main()
{
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cout<<"Enter the elements in the array"<<endl;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int od=0,ev=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      ev=1;
    else
      od=1;
    if(od==1 && ev==1)
    {
      cout<<"The array is Mixed"; return 0;
    }
  }
  if(od==1)
    cout<<"The array is Odd";
  else
    cout<<"The array is Even";
}