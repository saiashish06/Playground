#include<iostream>
using namespace std;
int main()
{
  int n,a[100],ele,p;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>p;
  if(p>n){
    cout<<"Invalid Input"; return 0;}
  for(int i=n;i>=p-1;i--)
    a[i+1]=a[i];
  cout<<"Enter the value to insert"<<endl;
  cin>>a[p-1];
  cout<<"Array after insertion is"<<endl;
  for(int i=0;i<=n;i++)
    cout<<a[i]<<endl;
    
}