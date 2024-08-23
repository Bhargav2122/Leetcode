class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // we need to find the consecutive 1's 
        // taking two variable on is count => count the no of 1's
        // max1 => max no of 1's 

        int count = 0;
        int maxOne = Integer.MIN_VALUE;
         for(int i =0; i < nums.length; i++) {
            if( nums[i] == 1){
                count++;
            }
            else {
                maxOne = Math.max(maxOne, count);
                count = 0;
            }
         }
         return maxOne > count ? maxOne : count;
    }
}