#include <iostream>
#include <vector>
using namespace std;

int main(){
	int cnt;
	vector<string> str;

	cin>>cnt;

	for(int i=0; i<cnt ; i++){
		string s;
		string res;
		cin>>s;

		if(s.size()>10){
			res+=s[0];
			res+=to_string(s.size()-2);
			res+=s[s.size()-1];
		} else{
			res = s;
		}


		str.push_back(res);
	}

	for(string s:str) cout<<s<<endl;


	return 0;
}