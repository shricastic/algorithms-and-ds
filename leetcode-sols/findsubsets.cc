#include <bits/stdc++.h>
using namespace std;

class Solution{
private:
  vector<string> v;
  void findSubsets(string& s, string res, int i){
    if(i==s.length()){
      v.push_back(res);
      return;
    }

    findSubsets(s, res, i+1);
    findSubsets(s, res+s[i], i+1); 
  }
  
public:
  void subsets(string& s){
    findSubsets(s, "", 0);
    
    for(string str : v){
      cout << str << " ";
    }
  }
};

int main(){
  string s = "abc";
  Solution S;
  S.subsets(s); 

  return 0;
}
