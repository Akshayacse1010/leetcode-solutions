class Solution {
    public int searchInsert(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int tempans = arr.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid] > target){
                tempans =  mid;
                high = mid - 1;
            }
            if(arr[mid] < target){
                low = mid + 1;
            }
        }
        return tempans;
    }
}