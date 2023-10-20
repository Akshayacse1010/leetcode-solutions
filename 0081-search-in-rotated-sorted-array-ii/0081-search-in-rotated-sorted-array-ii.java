class Solution {
    public boolean search(int[] arr, int target) {
        int n = arr.length;
        int low = 0 , high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid]== target){
                return true;
            }
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
               continue; 
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && arr[mid] >= target){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(arr[high] >= target && arr[mid] <= target){
                    low = mid +1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}