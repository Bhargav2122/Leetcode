class Solution {
    public int maxSubArray(int[] nums) {
        //The optimal appraoch is KADANE'S ALGO
        //The Intuition behind is simple if the sum is -ve. if (sum < 0)
        //we get least sum so we ignore -ve sum for that we set sum = 0.
        // TC: O(N) SC : O(1)

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
              sum += nums[i];
              maxSum = sum > maxSum ? sum : maxSum;
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
          
    }
}
/*

The brute force approach that comes to my mind is
 iterate through array and keep another variable j it starts from i take the sum 
 we simply return maxSum . TC:O(~N*2)
int maxSum = Integer.MIN_VALUE;
        for(int i =0; i < nums.length; i++) {
              int sum =0;
            for(int j =i; j < nums.length; j++){
               sum += nums[j];
               if(maxSum < sum) {
                maxSum = sum;
               }
            }
        }
        return maxSum;

*/