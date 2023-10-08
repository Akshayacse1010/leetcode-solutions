class Solution {
    public int searchInsert(int[] arr, int target) {
          int low = 0;
          int x = arr.length;
        int high = arr.length -1;
        while (low <= high){
            int mid = (low + high) /2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                low = mid +1;

            }
            else if(target < arr[mid]){
                high  = mid -1;
                x = mid;
            }
        }
        return x;
    }
}