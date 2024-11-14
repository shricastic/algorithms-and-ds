#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, cnt = 0;
    vector<int> A;

    cin >> N;

    for(int i = 0; i < N; i++) {
        int a;
        cin >> a;
        A.push_back(a);
    }

    bool flag = true;

    while(flag) {
        for(int i = 0; i < N; i++) {
            if(A[i] % 2 != 0) {
                flag = false; 
                break;  
            }
        }

        if(flag) { 
            for(int i = 0; i < N; i++) {
                A[i] /= 2; 
            }
            cnt++; 
        }
    }

    cout << cnt;
    return 0;
}
