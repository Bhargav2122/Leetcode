class Solution {
    public void moveZeroes(int[] nums) {
        // here j count the zeroes
        //i is non-zeroes
        int j = -1;
        for(int i =0 ; i < nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j==-1) {
            return;
        }
        for(int i = j + 1; i < nums.length; i++) {
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    
    }
 
}
 /* 
   we just move the zeros to end the brute force approach is 
   take temp array store non zeroes 
    x = non-zeroes
   time:O(n) + O(x) + O(n -x) => O(2 * n)
   space : O(x)
    
   ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                temp.add(nums[i]);
            }
        }
        int n = temp.size();
        for (int i = 0; i < n; i++) {
            nums[i] = temp.get(i);
        }
        for(int i = n; i < nums.length; i++) {
            nums[i] = 0;
        }
   */