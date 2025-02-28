#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  // Your code here
  ll n, sum = 0; 

  cin >> n;

  ll expected_sum = n* (1 + n) / 2;

  for(int i=0 ; i<n-1 ; i++){
    ll tmp;
    cin >> tmp;
    sum += tmp;
  }

  cout << (expected_sum - sum) << "\n";
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  run();
  return 0;
}
