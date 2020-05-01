#include<iostream>
using namespace std;
int sq(int n)
{
  int i=1;
  while(i*i<=n)
    i++;
 return i;
}
int main()
{
 int n;
  cin>>n;
 cout<< sq(n)+n;
}