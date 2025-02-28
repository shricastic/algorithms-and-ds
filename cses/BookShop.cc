#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  int n;
  cin >> n;

  vector<vector<int>> v(n, vector<int>(n,0));

  for(int i=0 ; i<n ; i++){
    for(int j=0 ; j<n ; j++){
      char c;
      cin >> c;
      c=='.'? v[i][j]=1 : v[i][j]=0;
    }
  }
  
  vector<vector<int>> dp(n, vector<int>(n, 0));

  dp[0][0] = v[0][0];

  for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
          if (v[i][j] == 0) continue; 
          
          if (i > 0) {
              dp[i][j] = (dp[i][j] + dp[i-1][j]) % MOD;
          }
          if (j > 0) {
              dp[i][j] = (dp[i][j] + dp[i][j-1]) % MOD;
          }
      }
  }

  cout << dp[n-1][n-1] << endl; 
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    run();
    return 0;
}
