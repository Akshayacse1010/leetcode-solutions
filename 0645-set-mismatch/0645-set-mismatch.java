class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
    int[] li = {1 ,-1};

        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i]!= nums[correct]){
                int a = nums[i];
                nums[i] = nums[correct];
                nums[correct] = a;
            }else{
                i++;
            }
        }
        for(int k = 0; k < nums.length; k++){
           if(k+1 != nums[k]){
               li[0] = nums[k];
               li[1] = k+1;
           }
        }
        return li;
    }
}