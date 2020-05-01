#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2,total;
  cin>>d1>>c1>>d2>>c2;
  total=d1+d2;
  total+=(c1+c2)/100;
  cout<<total<<endl<<((c1+c2)%100);
}