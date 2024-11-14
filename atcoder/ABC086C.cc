#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N;
    cin >> N;

    vector<int> t(N), x(N), y(N);
    
    for (int i = 0; i < N; i++) {
        cin >> t[i] >> x[i] >> y[i];
    }

    // Start at (0, 0) at time 0
    int currentX = 0, currentY = 0, currentTime = 0;

    for (int i = 0; i < N; i++) {
        int nextTime = t[i];
        int nextX = x[i];
        int nextY = y[i];

        // Calculate time available and distance needed
        int timeDiff = nextTime - currentTime;
        int distance = abs(nextX - currentX) + abs(nextY - currentY);

        // Check if it's possible to reach the next point
        if (timeDiff < distance || (timeDiff - distance) % 2 != 0) {
            cout << "No" << endl;
            return 0;
        }

        // Update current position and time
        currentX = nextX;
        currentY = nextY;
        currentTime = nextTime;
    }

    cout << "Yes" << endl;
    return 0;
}
