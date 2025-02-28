#include <bits/stdc++.h>
using namespace std;

void solve() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> arr(n);

        int minIdx = 0, maxIdx = 0;

        for (int i = 0; i < n; i++) {
            cin >> arr[i];
            if (arr[i] < arr[minIdx]) minIdx = i;
            if (arr[i] > arr[maxIdx]) maxIdx = i;
        }

        // Option 1: Remove both from the left
        int option1 = max(minIdx, maxIdx) + 1;

        // Option 2: Remove both from the right
        int option2 = max(n - minIdx, n - maxIdx);

        // Option 3: Remove one from the left, one from the right
        int option3 = min(minIdx + 1 + (n - maxIdx), maxIdx + 1 + (n - minIdx));

        // Minimum of the three options
        int result = min({option1, option2, option3});

        cout << result << endl;
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    solve();
    return 0;
}
