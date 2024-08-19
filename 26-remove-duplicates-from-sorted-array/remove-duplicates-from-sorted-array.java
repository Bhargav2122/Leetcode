class Solution {
    public int removeDuplicates(int[] nums) {
        /*
         the problem is simple we can apply two pointer approach
         we need to find the number of unique elements in the nums array
         for that we taking j var as no.of.unique elements in array
        */
        int j = 1;
        for(int i=1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}