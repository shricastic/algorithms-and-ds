#include <bits/stdc++.h>
using namespace std;

void run() {
  int n, res = 0;

  cin >> n;

  vector<int> bills = {100, 20, 10, 5, 1};

  for(int bill : bills){
    if(n<=0) break;
    res += n/bill;
    n %= bill; 
  }

  cout << res;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    run();
    return 0;
}     
