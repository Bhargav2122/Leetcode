class Solution {
    public int singleNumber(int[] nums) {
      // the most optimal solution is XOR operation
      // 1 ^ 1 = 0
      // 1 ^ 0 = 1
      //xor of same number is 0, xor any number with 0 will result in number itslef
       int xor = 0;
       for(int i =0; i < nums.length; i++) {
        xor  = xor ^ nums[i];
       }
       return xor;
    }
}
//brute force approach
    // Size of the array:
    /*
        int n = arr.length;

        //Run a loop for selecting elements:
        for (int i = 0; i < n; i++) {
            int num = arr[i]; // selected element
            int cnt = 0;

            //find the occurrence using linear search:
            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    cnt++;
            }

            // if the occurrence is 1 return ans:
            if (cnt == 1) return num;
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
        */