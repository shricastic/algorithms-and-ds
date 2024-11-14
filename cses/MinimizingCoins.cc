#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  int n, x; 
  cin >> n >> x;

  vector<int> coins(n), dp(x+1, INT_MAX);
  for(int i=0 ; i<n ; i++) cin >> coins[i];
  sort(coins.rbegin(), coins.rend());
  dp[0] = 0;

  for(int i=0 ; i<n ; i++){
    for(int j=coins[i] ; j<=x ; j++){
      if(dp[j-coins[i]] != INT_MAX){
        dp[j] = min(dp[j], dp[j-coins[i]]+1);
      }
    }
  }

  cout << (dp[x]==INT_MAX ? -1 : dp[x]) << endl;
  
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    run();
    return 0;
}
