	#include <bits/stdc++.h>
	using namespace std;

	class Solution {
	private:
		vector<string> vovels = {"a","e","i","o","u"};
		
		int lexiString(int n, string s, int& cnt){
			if(s.size() == n) return 1;
			bool flag = false;
			for(int i=0 ; i<vovels.size() ; i++){
				if(flag){
					s.push_back(vovels[i]);
					cnt += lexiString(n, s, cnt);	
				}
				if(vovels[i] = s.back()) flag=true;
			}		 
		}
	public:
	    int countVowelStrings(int n) {
	    	int cnt = 0;
	    	for(int i=0 ; i<vovels.size() ; i++){
	    		lexiString(n, vovels[i]);
	    	}

	    	cout<< cnt;
	    	return cnt;    
	    }
	};

int main(){
	Solution sol;
	sol.countVowelStrings(1);

	return 0;
}