#include <bits/stdc++.h>
using namespace std;

class Solution{
private:
	bool isPalindrome(string s){
		int fi = 0, li = s.size()-1;

		while(fi<=li){
			if(s[fi]!=s[li]) return false;
		}

		return true;
	}


public:
	string nearestPalindromic(string n){
		long n = stoi(n);
		int res = n, min = INT_MAX;

		for(long i=n ; i>0 ; i++){
			i++;

			if(isPalindrome(to_string(i))){
				min = abs(n-i);
				res = i;
				break;
			}
		}

		for(long i=n ; i>0 ; i++){
			i--;

			if(isPalindrome(to_string(i))){
				if(abs(n-i)<min){
					min = abs(n-i);
					res = i;
					break;
				}
			}
		}


		return to_string(res);
	}
};



int main(){
	string n = "123";

	Solution s;
	string res = s.nearestPalindromic(n);

	cout<<res;
	return 0;	
}