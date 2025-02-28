#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

void run() {
  int t;
  cin >> t;

  while(t--){
    int n, k;
    cin >> n >> k;

    vector<int> v(n);
    for(int i=0; i<n ; i++) cin>>v[i];

    if(is_sorted(v.begin(), v.end())) { cout<<"YES"<<endl; break; }
    
    for(int i=0 ; i<n-k ; i++){
      sort(v.begin(), v.begin()+k);
    }
    
    cout<< (is_sorted(v.begin(), v.end())? "YES\n": "NO\n");
  }
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  run();
  return 0;
}
