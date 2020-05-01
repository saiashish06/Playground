#include<iostream>
#include<string>
#include<cstring>
using namespace std;
  

int main()
{
   string name;
  int id;
  int age;
  string dept;
  float gpa;
  cout<<"Enter name:"<<endl;
    cin>>name;
    cout<<"Enter ID:"<<endl;
    cin>>id;
    cout<<"Enter age:"<<endl;
    cin>>age;
    cout<<"Enter designation:"<<endl;
    cin>>dept;
   cout<<"Enter Salary:\n";
   cin>>gpa;

    cout<<"Employee Details"<<endl;
    cout<<"Name of the Employee : "<<name<<endl;
    cout<<"ID of the Employee : "<<id<<endl;
    cout<<"Age of the Employee : "<<age<<endl;
    cout<<"Designation of the Employee : "<<dept<<endl;
    cout<<"Salary of the Employee : "<<gpa<<endl;
   
}