class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while( i < nums.length) {
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else {
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++ ) {
            if(nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }
    void swap (int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}