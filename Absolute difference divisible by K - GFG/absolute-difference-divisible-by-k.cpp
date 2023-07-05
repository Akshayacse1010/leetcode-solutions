//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    long long countPairs(int n, int arr[], int k) {
        // map<int,long long>mp;
        vector<long long>v(k);
        long long vi  =0;
        for(int i=0;i<n;i++){
            // mp[arr[i]%k]++;
         v[arr[i]%k]+=1;
        }
       for(long long i:v){
           vi+= (((i-1)*i)/2);
       }
        return vi;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n,k;
        cin>>n;
        
        int arr[n];
        for(int i=0; i<n; i++)
            cin>>arr[i];
        
        cin>>k;

        Solution ob;
        cout << ob.countPairs(n,arr,k) << endl;
    }
    return 0;
}
// } Driver Code Ends