class Solution {
public:
    int findCenter(vector<vector<int>>& edges) {
    unordered_map<int,int>mp;
    int ans = -1;
    for(int i =0;i<edges.size();i++){
    mp[edges[i][0]]++;
    mp[edges[i][1]]++;
    } 
    for(int i =1;i<=mp.size();i++){
        if(mp[i]==mp.size()-1)ans = i;
    }
    return ans;
    }
};