#include <bits/stdc++.h>
using namespace std;

bool toSwap(int a, int b){
	if(a > b) return true;
	return false;
}

int main(){
	int n;
	cin >> n;
	vector<int> arr(n);

	for(int i=0 ; i<n ; i++){
		cin >> arr[i];
		cout << arr[i] << " ";
	}

	cout<< endl;

	for(int i=0 ; i<n ; i++){
		for(int j=i+1 ; j<n ; j++){
			if(toSwap(arr[i], arr[j])) swap(arr[i], arr[j]);
		}
	}

	for(int i : arr) cout << i << " ";

	return 0;
}