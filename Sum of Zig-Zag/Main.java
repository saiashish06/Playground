#include<iostream>
using namespace std;
int main()
{
 int a,b;
  cin>>a>>b;
  int ar[a][b];
   for(int i=0;i<a;i++)
     for(int j=0;j<b;j++)
       cin>>ar[i][j];
  int max=0;
   for(int i=0;i<a;i++)
   {
     for(int j=0;j<b;j++)
       if(i==j||i==0||i==a-1)
       {
         max+=ar[i][j];
       }
   
   }
     cout<<"Sum of Zig-Zag pattern is "<<max<<endl;
}