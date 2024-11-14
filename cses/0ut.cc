#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  int n;
  cin >> n;

  vector<int> dp(n+1, 1e9);
  dp[0] = 0;

  for(int i=1 ; i<=n ; i++){
    int tmp = i;

    while(tmp > 0){
      int d = tmp % 10;
      tmp /= 10;

      if(d > 0) dp[i] = min(dp[i], 1 + dp[i-d]);
    }
  }
  
  cout << dp[n];
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    run();
    return 0;
}
