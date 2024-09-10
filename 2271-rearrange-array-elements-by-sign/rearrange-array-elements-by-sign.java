class Solution {
    public int[] rearrangeArray(int[] nums) {
        // the optimal approach is not taking any other pos and neg arrays instead
        // doing it in single traversal. i know that my return array will have 
        // pos at even index and neg at odd index.
        int[] ans = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;
        for(int i= 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
            else 
            {
                ans[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return ans;
    }
}
/* The brute force approach first that comes to mind is 
        i know that -ve and +ve are equal number 
        what i do is i iterate through the array i store -ve numbers in one array or list
        i store the +ve elements in another array.i done storing -ve and +ve.
        i iterate through the array of the both if it is pos i store at even index other wise 
        i store at odd index 
         
         TC : O(N) + O(N / 2)

        int n = nums.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int posIndex = 0;
        int negIndex = 0;
        for(int i =0 ; i < n; i++) {
            if(nums[i] < 0) {
                neg[negIndex++] = nums[i];
            }
            else {
                pos[posIndex++] = nums[i];
            }
        }
        int[] ans  = new int[n];
        for(int i = 0; i < n/2; i++) {
            ans[2*i] = pos[i];
            ans[2*i + 1] = neg[i];
        }
         return ans;
         */