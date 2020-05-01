#include<iostream>
using namespace std;
int main()
{
  char in[30],out[30];
  cin>>in;
  int i=0;
  for(int j=0;in[j]!='\0';j++)
    if((in[j]>=65&&in[j]<=91)||(in[j]>=97&&in[j]<=123))
      out[i++]=in[j];
     out[i]='\0';
  cout<<out;
}