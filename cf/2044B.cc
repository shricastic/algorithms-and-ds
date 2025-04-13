#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  int t; 
  cin >> t;

  while(t--){
    string s;
    cin >> s;
    reverse(a.begin(), a.end());
    for(int i=0 ; i<s.size() ; i++){
      if(s[i] == 'p') s[i] = 'q'; 
      if(s[i] == 'q') s[i] = 'p';
    }

    cout << s << endl;
  }
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  run();
  return 0;
}
