#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  int t; 
  cin >> t;

  while(t--){
    int a, b, res, num;
    cin >> a >> b;

    num = (a + b)/ 2;

    res = (num-a) + (b-num);
    
    cout << res << endl;
  }
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  run();
  return 0;
}
