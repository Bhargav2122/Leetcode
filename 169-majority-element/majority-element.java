class Solution {
    public int majorityElement(int[] nums) {
        /* The Optimal approach i can go with is MOOR'S VOTING ALGORITHM
           i take the two variables count = 0; and candidate = -1;
           first:
           i iterate through the array if my count = 0;
           then i assign the nums[i] to candidate. if candidate == nums[i] then i increase the
           count++ if not i decrease count--.Y i know that majority element will appear more in
            array so another element comes then i know that some element has more chance to win
            for that i set count = 0; if my candidate === nums[i] ok this can be my majority.
        */
        int count = 0;
        int candidate = 0;
        // candidate checking
        for(int i= 0; i < nums.length; i++) {
            if(count == 0) {
                candidate = nums[i];
                count = 1;
            }
            else if (candidate == nums[i]) {
                count++;
            }
            else {
                count--;
            }
        }
        int majCount = 0;
        //verify candidate is majority or not
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] == candidate) {
                majCount++;
            }
        }
        if(majCount > (nums.length / 2)) {
            return candidate;
        }
        return -1;
    }
}
/* Better Approach
 HashMap<Integer, Integer> map = new HashMap<>();
     for(int i =0; i < nums.length; i++) {
        map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);
     }
     for(Map.Entry<Integer, Integer> count : map.entrySet()) {
        if(count.getValue() > nums.length / 2) {
           return count.getKey();
        }
      }
      return -1;*/
       /* The first approach i can go with comparing element with entire array and keep count
          if my count > n/2 then i can simply return elemnt 
          it takes O(n*2) => two iterations
        int n = nums.length;
        for(int i =0; i < nums.length; i++) {
            int count= 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]) {
                    count++;
                }
                if(count > n /2 ) {
                    return nums[i];
                }
            }
        }
        return -1;*/