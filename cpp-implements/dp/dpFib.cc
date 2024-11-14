#include <bits/stdc++.h>
using namespace std;

int fib(int n, int dp[]){
  if(n<2) return n;
  
  if(dp[n] != -1) return dp[n];
  dp[n] = fib(n-1, dp) + fib(n-2, dp);
  
  return dp[n];
}

int main(){
  int n = 5;
  int dp[n+1];
  fill(dp, dp+n+1, -1);

  cout<< fib(n, dp);

  return 0;
}
