//{ Driver Code Starts
//Initial template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++

class Solution{   
public:
    int countZeroes(int arr[], int n) {
        int j=n-1,i=0;
        
        if(n==2){
            if(arr[0]==1 && arr[1]==0)  return 1;
            // if(arr[1]==1 && arr[0]==1)  return 0;
        }
        while(i<n && j>=0){
            if(arr[i]==0)   return n-i;
            else if(arr[j]==1)  return n-j-1;
            i++;
            j--;
        }
        return 0;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.countZeroes(arr, n);
        cout << ans << "\n";
    }
    return 0;
}


// } Driver Code Ends