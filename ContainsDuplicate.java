// O(n) Time || O(n) Space
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> num = new HashMap<Integer, Boolean>();
        for(int i = 0; i < nums.length; i++){
            if(num.containsKey(nums[i]))
                return true;
            else
                num.put(nums[i], true);
        }
        return false;
    }
}