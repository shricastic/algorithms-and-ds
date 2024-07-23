#include <iostream>
using namespace std;

int lexDiff(string s, string b) {
    for (int i = 0; i < s.size(); i++) {
        int si = int(s[i]);
        int bi = int(b[i]);

        if (si < 97) si += 32;  
        if (bi < 97) bi += 32;  

        if (si < bi) return -1;
        if (si > bi) return 1;
    }

    return 0;
}

int main() {
    string s, b;

    cin >> s;
    cin >> b;

    cout << lexDiff(s, b);

    return 0;
}
