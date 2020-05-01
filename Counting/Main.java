#include<iostream>
#include<cstring>
using namespace std;
int main()
{
 char sen[1000];
int i,n,sp=0,count=0,ovels=0,num=0;
  cin.getline(sen,1000);
  n=strlen(sen);
  for(i=0;i<n;i++)
   {
    if(sen[i]==' ')
     count++;
    else
      if(sen[i]=='a'||sen[i]=='e'||sen[i]=='i'||sen[i]=='o'||sen[i]=='u'||sen[i]=='A'||sen[i]=='E'||sen[i]=='I'||sen[i]=='O'||sen[i]=='U')
      {
        ovels++;
      }
      else
      if(sen[i]>=48&&sen[i]<=57)
        num++;
     else
      if(!((sen[i]>=65&&sen[i]<=(65+26))||(sen[i]>=97&&sen[i]<=(97+26))))
        sp++;
   }
  cout<<"Vowels:"<<ovels<<endl;
  cout<<"Consonants:"<<(n-ovels-count-num-sp)<<endl;
  cout<<"White Spaces:"<<count<<endl;
  cout<<"Digits:"<<num<<endl;
  cout<<"Symbols:"<<sp;
}