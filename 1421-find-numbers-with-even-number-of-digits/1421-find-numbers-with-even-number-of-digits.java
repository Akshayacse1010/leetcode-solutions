class Solution {
    public int findNumbers(int[] nums) {
      int sum = 0;
      for(int x : nums){
          int c = 0;
          while(x > 0){
              c++;
              x = x/10;
          }
          if(c %2 == 0){
              sum++;
          }
      }
      return sum;  
    }
}