#include <bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;

	while(t--){
		int n;
		cin >> n;

		vector<int> heights(n);
		for(int i=0 ; i<n ; i++) cin >> heights[i];

		vector<int> dp(n);	
		dp[n-1] = heights[n-1];

		for (int i = n-2; i >= 0; i--) {
            dp[i] = max(heights[i], dp[i+1] + 1);
        }
        
        int result = *max_element(dp.begin(), dp.end());

		cout << result << endl;
	}

	return 0;
}