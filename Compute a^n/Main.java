#include<iostream>
using namespace std;
int power(int a,int b)
{
 if(b==1)
   return a;
  return a*power(a,b-1);
}
int main()
{
  int n,m;
  cout<<"Enter the value of a"<<endl;
  cin>>n;
   cout<<"Enter the value of n"<<endl;
  cin>>m;
  cout<<"The value of "<<n<<" power "<<m<<" is "<<power(n,m);
  
  
}