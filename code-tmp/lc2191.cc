#include <bits/stdc++.h>
using namespace std;

bool toSwap(pair<int, int> a, pair<int, int> b){
	return a.first < b.first;
}

int convert(int num, vector<int>& mapping){
	if (num == 0) return mapping[0];

    int result = 0;
    int factor = 1;

    while (num > 0) {
        int digit = num % 10;
        num /= 10;
        result += mapping[digit] * factor;
        factor *= 10;
    }

    return result;
}

int main(){
	vector<int> mapping = {8,9,4,0,2,1,3,5,7,6}, nums = {991,338,38};
	vector<pair<int, int>> intmap;

	for(int i = 0; i<nums.size() ; i++){
		intmap.push_back({convert(nums[i], mapping), nums[i]});
	}

	sort(intmap.begin(), intmap.end(), toSwap);

	vector<int> res;
	for(auto pair : intmap){
		cout << pair.second << " ";
		res.push_back(pair.second);
	}

	return 0;
}