//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
	
	
	public:
	  
	void bitonicGenerator(int arr[], int n)
	{
		vector<int>v1;
		vector<int>v2;
		for(int i=0;i<n;i++){
		    (i%2)?v1.push_back(arr[i]):v2.push_back(arr[i]);
		}
		sort(v1.begin(),v1.end());
		sort(v2.begin(),v2.end());
		reverse(v1.begin(),v1.end());
	
		for(int i =0;i<v2.size();i++){
		    arr[i] =v2[i]; 
		    }
		    for(int i=0;i<v1.size();i++){
		        arr[i+v2.size()] = v1[i];
		    }
	}
		 

};

//{ Driver Code Starts.

int main() 
{
   
   
   	int t;
    cin >> t;
    while (t--)
    {
    	int n;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	    cin>>arr[i];


        

        Solution ob;
        ob.bitonicGenerator(arr, n);
        
        for (int i = 0; i < n; i++) 
        	cout << arr[i] << " "; 

	    cout << "\n";
	     
    }
    return 0;
}


// } Driver Code Ends