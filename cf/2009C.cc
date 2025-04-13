#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  
  // Shri's code here
  int t;
  cin >> t;

  while(t--) {
    int x, y, k, moves;
    cin >> x >> y >> k;

    int min_x = (x + k - 1)/k;
    int min_y = (y + k - 1)/k;

    if(min_y<min_x){
      moves = 2 * min_x - 1;
    } else {
      moves = 2 * min_y;
    }

    cout << moves << endl;
  }
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  run();
  return 0;
}
