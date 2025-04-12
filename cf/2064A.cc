#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  int t;
  cin >> t;

  while (t--) {
    string s;
    cin >> s;

    if (s.size() >= 2 && s[s.size() - 2] == 'u' && s[s.size() - 1] == 's') {
      s = s.substr(0, s.size() - 2);
      s = s+'i';
    }

    cout << s << '\n';
  }
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  run();
  return 0;
}
