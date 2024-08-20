class Solution {
    public void rotate(int[] nums, int k) {
     int n = nums.length;
     k = k % n;
     if(n==0){
        return;
     }
    //optimal approach is 
     reverse(nums, 0, n-k-1);
     reverse(nums, n-k, n-1);
     reverse(nums,0,n-1);
    }

    public void reverse(int[] arr, int start,int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
 /* 
         the given problem is [1, 2, 3, 4, 5]
         if we rotate to right by k = 3
         the result array be like [3, 4, 5, 1, 2]
        
        the first brute approach comes in my mind is we take the temp array store the values by k positions
        after placing the array elem in temp. we traverse the array first k positions filled by temp array rest
        remain same.

        time :O(n-k) + O(k) +O(n)
        space : O(k)
        
         int n = nums.length;
         k = k % n;
         int[] temp = new int[k];
        for (int i = n-k; i <n ; i++) {
            temp[i- n + k] = nums[i];
        }
        for (int i = n- k- 1; i >= 0 ; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    } */