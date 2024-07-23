#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int idx;
    int s;
    int res = 0;

    cin >> s >> idx;
    vector<int> nums(s);

    for (int i = 0; i < nums.size(); i++) {
        cin >> nums[i];
    }

    for(int i:nums){
    	if(i>0){
    		if(i>=nums[idx-1]) res++;	
    	}
    }

    cout << res;

    return 0;
}
