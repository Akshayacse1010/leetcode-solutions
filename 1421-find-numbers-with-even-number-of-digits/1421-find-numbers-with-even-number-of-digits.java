class Solution {
    public int findNumbers(int[] nums) {
      int sum = 0;
      for(int x : nums){

   int c = (int)Math.floor(Math.log10(x) + 1);
          if(c %2 == 0){
              sum++;
          }
      }
      return sum;  
    }
}