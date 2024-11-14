#include <bits/stdc++.h>
using namespace std;

int main(){
  int n = 5;
  int dp[n+1];
  int prev1 = 0, prev2 = 1;

  for(int i=2 ; i<=n ; i++){
    int cur = prev1 + prev2;
    prev1 = prev2;
    prev2 = cur;
  }

  cout<< prev2 <<" "; 

  return 0;
}
