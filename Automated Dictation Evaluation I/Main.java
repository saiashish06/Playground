#include<iostream>
#include<string>
#include<cstring>
using namespace std;
int main()
{
 char str[100],str1[100];
  cin>>str;
  cin>>str1;
  if(strlen(str)==strlen(str1)){
    for(int i=0;i<strlen(str);i++)
      if(str[i]!=str1[i])
      {
        cout<<"It is wrong";
        return 0;
      }
    cout<<"It is correct";
}      
 else
   cout<<"It is wrong";
   return 0;
  
}