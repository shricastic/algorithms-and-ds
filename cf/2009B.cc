#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  
  // Shri's code here
  int t;
  cin >> t;

  while(t--) {
    int n;
    cin >> n;
    deque<int> d;

    while(n--){
      string s;
      cin >> s;

      for(int i=0 ; i<s.size() ; i++){
        if(s[i] == '#') d.push_front(i+1);
      }
    }

    for(int i : d){
      cout << i << " ";
    }
    cout << endl;
  }
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  run();
  return 0;
}
