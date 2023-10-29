class Solution {
public:
    int findDuplicate(vector<int>& a) {
               
                int n = a.size();
   
        sort(a.begin(),a.end());
        for(int i=0;i<n-1;i++){
            if (a[i]==a[i+1]) {
                return a[i];
            }
        }
       return -1; 
    }
};