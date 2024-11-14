#include <bits/stdc++.h>
using namespace std;

int main(){
	int N, res=0, prev;
	cin >> N;

	unordered_set<int> st;

	for(int i=0 ; i<N ; i++){
		int cur;
		cin >> cur;

		st.insert(cur);
	}

	cout << st.size();

	return 0;
}	