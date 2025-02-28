#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

int fair_division(int n, int ts, int os, vector<int>& dp){
  if(n==0) return 1; 
  if(n<0 || (ts==0 && os==0))  return 0; 
  
  int oneRes = 0, twoRes=0;
  if(dp[n]!=-1) return dp[n];

  if(os>0) oneRes = fair_division(n-1, ts, os-1, dp); 
  if(ts>0) twoRes = fair_division(n-2, ts-1, os, dp); 
  dp[n] = oneRes || twoRes;

  return dp[n];
}

void run() {
  int t;
  cin >> t;
  
  while(t--){
    int n, twos=0, ones=0, sum=0;
    cin >> n;

    vector<int> nums(n, 0);
    for(int i=0; i<n ; i++){
      cin>> nums[i];
      nums[i] == 2? twos++: ones++;
      sum+=nums[i];
    }

    if(sum%2 != 0){
      cout<< "NO\n";
      continue;
    }

    vector<int> dp((sum/2)+1, -1);
    cout << (fair_division(sum / 2, twos, ones, dp) ? "YES\n" : "NO\n");
  }
}


int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  run();
  return 0;
}
