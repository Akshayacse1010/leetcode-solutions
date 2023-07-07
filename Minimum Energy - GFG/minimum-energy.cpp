//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution{
    public:
    int minEnergy(int a[], int n)
    {
         int x = 0;
       int sum = 0;
       for(int i=0;i<n;i++){
           sum += a[i];
           if(sum <= 0){
               x += 1-sum;
               sum = 1;
           }
       }
       if(x==0) return 1;
       else{
           return x;
       }


    }
};

//{ Driver Code Starts.
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int i,a[n];
		for(i=0;i<n;i++)
		{
			cin>>a[i];
		}
		Solution ob;
		cout<< ob.minEnergy(a,n) <<endl;
	}
	return 0;
}
// } Driver Code Ends