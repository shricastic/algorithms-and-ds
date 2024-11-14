#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    string s;
    cin >> s;
    vector<int> nums;

    for (int i = 0; i < s.size(); i++) {
        if (s[i] == '+') {
            continue;
        } else {
            int tmp = s[i] - '0';
            nums.push_back(tmp);
        }
    }

    sort(nums.begin(), nums.end());
    string res;

    for (int i = 0; i < nums.size(); i++) {
        if (res.size() == 0) {
            res.push_back(nums[i] + '0');
        } else {
            res += '+';
            res.push_back(nums[i] + '0');
        }
    }

    cout << res;

    return 0;
}
