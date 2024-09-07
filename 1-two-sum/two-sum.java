class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* the approach that comes to mind is hashmap
          thought process is [2, 7, 11, 15] => 2 + 7 == 9
          ans i can say 9 - 2 = 7 simply i can return 2(index) adn 7)index.
           subtract target - nums[i]. and check the value in hashmap return indices if it 
           was there otherwise add <element, i> into tha hashmap

           Time:O(n) Space : O(n)
           */
       HashMap<Integer, Integer> check = new HashMap<>();
       for(int i = 0; i < nums.length; i++) {
          int req = target - nums[i];
          if(check.containsKey(req)) {
             return new int[] {i, check.get(req)};
          }
          check.put(nums[i], i);
       }
       return new int[]{};
    }
}
 /* Fisrt approach that comes to my mind is check every element with other 
           element that sum == target 
           it takes O(n*2), O(1)
        for(int i= 0; i < nums.length - 1; i++) {
            for(int j= i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
        */