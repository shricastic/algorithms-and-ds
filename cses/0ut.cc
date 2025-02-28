#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  int n, x;
  cin >> n >> x;

  vector<int> page(n), price(n);
  
  for(int &i : price) cin >> i;
  for(int &i : page) cin >> i;

  vector<vector<int>> dp(n+1, vector<int>(x+1, 0));

  for(int i=1; i<=n ; i++){
    for(int j=0; j<=x ; j++){
      dp[i][j] = dp[i-1][j];

      if(j >= price[i-1]){
        dp[i][j] = max(dp[i][j], dp[i-1][j-price[i-1]] + page[i-1]);
      }
    }
  }

  cout << dp[n][x] << endl;

  return;
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  run();
  return 0;
}
