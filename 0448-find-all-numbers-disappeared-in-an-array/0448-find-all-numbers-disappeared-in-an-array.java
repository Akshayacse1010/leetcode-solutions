class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
           int i = 0;
           List<Integer> li = new ArrayList<>();
        while (i < nums.length) {
            int a = nums[i] - 1;
            if ( nums[i] != nums[a]) {
                int b = nums[i];
                nums[i] = nums[a];
                nums[a] = b;
            } else {
                i++;
            }
        }
        for(int k = 0;k < nums.length ; k++){
           if(nums[k] -1 != k){
               li.add(k +1);
           }
   
        }
        return li;
    }
}