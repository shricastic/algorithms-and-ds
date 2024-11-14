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

  for(int i=1 ; i<=x ; i++){
    for(int j=0 ; j<n ; j++){
      if(i-coins[j] >= 0){
        dp[i] = (dp[i]+ dp[i-coins[j]])%MOD; 
      }
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
