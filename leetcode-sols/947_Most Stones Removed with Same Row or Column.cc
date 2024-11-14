#include <bits/stdc++.h>
using namespace std;

class Solution {
private:
    void dfs(int u, vector<vector<int>>& adjList, vector<bool>& vis){
        vis[u] = true;
        
        for(int v : adjList[u]){
            if(!vis[v]){
                dfs(v, adjList, vis);
            }
        }
    }
    
public:
    int removeStones(vector<vector<int>>& stones) {
        vector<vector<int>> adjList(stones.size());
        vector<bool> vis(stones.size(), false);
        int groups = 0;
        
        for(int i=0 ; i<stones.size() ; i++){
            int u = stones[i][0], v = stones[i][1];
            adjList[u].push_back(v);            
        }
        
        
        for(int i=0 ; i<adjList.size() ; i++){
            if(!vis[i]){
                dfs(i, adjList, vis);
                groups++;
            }
        }
        
        return stones.size()-groups;
    }
};

int main(){
    Solution s;
    vector<vector<int>> test{{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
    int p = s.removeStones(test);
    cout >> p;
 
    return 0;
}