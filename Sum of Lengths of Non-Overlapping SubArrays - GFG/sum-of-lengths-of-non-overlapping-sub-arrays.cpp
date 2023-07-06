//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{

	public:
	int calculateMaxSumLength(int a[], int n, int k)
	{
	  int trp = 0,l=0,f=0;
	  for(int i= 0;i<n;i++){
	      if(a[i]<k){
	          l++;
	      }
	      if(a[i]==k){
	          f=1;
	          l++;
	      }
	      if(a[i]>k){
	          if(f==1){
	              trp+=l;
	          }
	          l = 0;
	          f = 0;
	      }
	  }
	  if(f==1)  trp+=l;
	  return trp;
	}	 

};

//{ Driver Code Starts.


int main() 
{
   	
   
   	int t;
    cin >> t;
    while (t--)
    {
    	int n, tmp;
	    cin>>n;
	    int arr[n];
	    for(int i=0; i<n; i++){
	        cin>>arr[i];
	   	}
	   	cin>>tmp;
            
        
        

        Solution ob;
		cout << ob.calculateMaxSumLength(arr, n, tmp);
        
	    cout << "\n";
	     
    }
    return 0;
}
// } Driver Code Ends