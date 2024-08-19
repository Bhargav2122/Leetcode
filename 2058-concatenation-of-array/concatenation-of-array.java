class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = 2 * nums.length;
        int[] arr = new int[n];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
        }
        return arr;
    }
}