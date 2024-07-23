#include<iostream>
#include<string>
using namespace std;

int main(){
	int x=0; 
	int cnt;

	cin>>cnt;

	for(int i=0; i<cnt ; ++i){
		string s; 
		cin>>s;

		if(s=="++X"||s=="X++") x++;
		if(s=="--X"||s=="X--") x--;
	}

	cout<<x;

	return 0;
}