class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] targetArr = new int[nums.length];

        for(int i = 0; i < list.size(); i++) {
            targetArr[i] = list.get(i);
        }
        return targetArr;
    }
}