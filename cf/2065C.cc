#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  // Your code here
  int t;
  cin >> t;

  while(t--){
    string s;
    cin >> s;

    bool b = false;
    for(int i=0 ; i<s.size()-1 ; i++){
      if(s[i] == s[i+1]) b = true;
    }

    b ? cout <<'1' << endl : cout << s.size() << endl;
  }
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  run();
  return 0;
}
