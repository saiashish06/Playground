#include<iostream>
using namespace std;
int main()
{
  int n,res=1;
  cin>>n;
  for(int i=1;i<=n;i++)
    res*=i;
  cout<<"The factorial of "<<n<<" is "<<res<<endl;
}