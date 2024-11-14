#include <iostream>
#include <string>

using namespace std;

int main() {
    string S;
    cin >> S;

    while (!S.empty()) {
        if (S.length() >= 5 && S.substr(S.length() - 5) == "dream") {
            S.erase(S.length() - 5);
        } else if (S.length() >= 6 && S.substr(S.length() - 6) == "eraser") {
            S.erase(S.length() - 6);
        } else if (S.length() >= 5 && S.substr(S.length() - 5) == "erase") {
            S.erase(S.length() - 5);
        } else if (S.length() >= 7 && S.substr(S.length() - 7) == "dreamer") {
            S.erase(S.length() - 7);
        } else {
            break;
        }
    }

    if (S.empty()) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }

    return 0;
}
