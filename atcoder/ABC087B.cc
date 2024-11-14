#include <bits/stdc++.h>
using namespace std;

int main(){
	int A, B, C, X;

	cin >> A >> B >> C >> X;

	int cnt=0;

	for(int i=0 ; i<=A ; i++){
		for(int j=0 ; j<=B ; j++){
			for(int k=0 ; k<=C ; k++){
				int total = i*500 + j*100 + k*50;
				if(total==X) cnt++;
			}
		}
	}	

	cout << cnt;
	return 0;
}