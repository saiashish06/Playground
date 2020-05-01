#include<iostream>
#include<string>
#include<cstring>
#include<bits/stdc++.h>
using namespace std;
int n;
  string name[100];
  string dept[5];
  int year[100];
  float gpa[100];
bool comparator(string a,string b)
{
    return a<b;
}

int main()
{
  
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  string temp[n];
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cin>>name[i];
    temp[i]=name[i];
    cout<<"Enter city"<<endl;
    cin>>dept[i];
    cout<<"Enter year of establishment"<<endl;
    cin>>year[i];
    cout<<"Enter pass percentage"<<endl;
    cin>>gpa[i];
  }
  sort(temp,temp+n,comparator);
   cout<<"Details of colleges"<<endl;
  for(int i=0;i<n;i++)
    {
    for(int j=0;j<n;j++)
    {
        if(temp[i]==name[j]){
     cout<<"College:"<<i+1<<endl;
     cout<<"Name:"<<name[j]<<endl;
     cout<<"City:"<<dept[j]<<endl;
     cout<<"Year of establishment:"<<year[j]<<endl;
     cout<<"Pass percentage:"<<gpa[j]<<endl;break;}
    }
    }
}