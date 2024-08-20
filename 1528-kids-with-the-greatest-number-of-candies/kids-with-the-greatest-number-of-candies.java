class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       ArrayList<Boolean> result = new ArrayList<>();
       for(int i = 0; i < candies.length; i++){
         if(candies[i] + extraCandies >= large(candies)) {
            result.add(true);
         }else{
            result.add(false);
         }
       } 
       return result;
    }
    public int large(int[] candies) {
         int max = candies[0];
         for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
         }
         return max;
    }
}