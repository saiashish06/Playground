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
   for(int i=0;i<a;i++)
   {int max=ar[i][0];
     for(int j=1;j<b;j++)
       if(max<ar[i][j])
         max=ar[i][j];
     cout<<max<<endl;
   }
   
}