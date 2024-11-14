#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007

using namespace std;

vector<int> monotonic_stack(vector<int>& arr){
  vector<int> res(arr.size());
  stack<int> st;

  for(int i=arr.size()-1 ; i>=0 ; i--){
    while(!st.empty() and st.top() <= arr[i]) st.pop();
    res[i] = st.empty()? -1 : st.top();
    st.push(arr[i]);
  }
  return res;
}

void run() {
  vector<int> heights = {2, 1, 2, 4, 3};
  vector<int> res = monotonic_stack(heights);
  for(int i:res) cout<< i << " ";
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    run();
    return 0;
}
