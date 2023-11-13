//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution{

   void merge(int arr[], int l, int m, int r) {
    int[] arrd = new int[r - l + 1];

    int i = 0;
    int leftIndex = l;
    int rightIndex = m + 1;

    while (leftIndex <= m && rightIndex <= r) {
        if (arr[leftIndex] <= arr[rightIndex]) {
            arrd[i] = arr[leftIndex];
            leftIndex++;
        } else {
            arrd[i] = arr[rightIndex];
            rightIndex++;
        }
        i++;
    }

    // Copy remaining elements from left subarray if any
    while (leftIndex <= m) {
        arrd[i] = arr[leftIndex];
        leftIndex++;
        i++;
    }

    // Copy remaining elements from right subarray if any
    while (rightIndex <= r) {
        arrd[i] = arr[rightIndex];
        rightIndex++;
        i++;
    }

    // Copy sorted values back to the original array
    for (i = 0; i < arrd.length; i++) {
        arr[l + i] = arrd[i];
    }
}

    void mergeSort(int arr[], int l, int r)
    {
     if (l == r) {
         return;}
         
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
     
    }
}
