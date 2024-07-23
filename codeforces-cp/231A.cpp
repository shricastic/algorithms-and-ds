#include <iostream>
using namespace std;

int main(){
	int res=0;
	int cnt;
	cin>>cnt;

	for(int i=0 ; i<cnt ; i++){
		int a=0,b=0,c=0;
		cin>>a>>b>>c;

		if((a+b+c)>1) res++;
	}

	cout<<res<<endl;

	return 0;
}