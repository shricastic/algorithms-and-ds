#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  // Your code here
  int t; 
  cin >> t;

  while(t--){
    int n; 
    cin >> n;
    int cnt = 0;

    for(int i=1 ; i<n ; i++){
      for(int j=0 ; j<n ; j++){
        if(n-j == i) cnt++; 
      }
    }

    cout << cnt << endl;
  }
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  run();
  return 0;
}
