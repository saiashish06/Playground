#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  
  for(int i=0;i<n;i++)
  {
    int max=a[0][i];
    for(int j=1;j<m;j++)
      if(max<a[j][i])
        max=a[j][i];
    cout<<max<<endl;
  }
}