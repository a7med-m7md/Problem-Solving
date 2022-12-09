// Time O(n) || Space O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
                                                 HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int x = target - nums[i];
            if(sums.containsKey(x))
                return new int[]{ sums.get(x), i};
            else
                sums.put(nums[i], i);
            
        }
        
        return new int[]{-1};
    }
}