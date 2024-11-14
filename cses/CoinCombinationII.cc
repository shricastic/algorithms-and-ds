#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  int n, x;
  cin >> n >> x;

  vector<ll> coins(n), dp(x+1, 0);
  for(int i=0 ; i<n ; i++) cin >> coins[i];
  
  dp[0] = 1;

  for(int i=0 ; i<n ; i++){
    for(int j=coins[i] ; j<=x ; j++){
      dp[j] = (dp[j]+ dp[j-coins[i]])%MOD; 
    }
  }
  
  cout << dp[x];
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    run();
    return 0;
}
