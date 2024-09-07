class Solution {
    public int majorityElement(int[] nums) {
     HashMap<Integer, Integer> map = new HashMap<>();
     for(int i =0; i < nums.length; i++) {
        map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);
     }
     for(Map.Entry<Integer, Integer> count : map.entrySet()) {
        if(count.getValue() > nums.length / 2) {
           return count.getKey();
        }
      }
      return -1;
    }
}
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