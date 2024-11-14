#include <bits/stdc++.h>
using namespace std;

int main(){
	int N;
	cin >> N;

	vector<int> cards(N); 
	for(int i=0 ; i<N ; i++) cin >> cards[i];

	sort(cards.begin(), cards.end(), greater<int>());

	int A=0, B=0;

	for (int i = 0; i < N; i++) {
        if (i % 2 == 0) {
            A += cards[i];
        } else {
            B += cards[i];
        }
    }

	cout << A-B;

	return 0;
}						