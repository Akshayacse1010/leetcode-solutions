class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0; 
        for(int i = 0 ; i < accounts.length ; i++){
            int count = 0;
            for (int x : accounts[i]){
                count += x;
            }
            if( max < count){
                max = count;
            }
        }
        return max;
    }
}