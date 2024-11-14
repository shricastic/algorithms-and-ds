#include <bits/stdc++.h>
using namespace std;

int digitSum(int num){
	int sum = 0;

	while(num>0){
		sum += num%10;
		num /= 10;
	}

	return sum;
}

int main(){
	int N, A, B, res = 0;

	cin >> N >> A >> B;

	for(int i=1 ; i<=N ; i++){
		int sum = digitSum(i);

		if(sum>=A && sum <= B) res+=i;
	}

	cout << res;

	return 0;
}