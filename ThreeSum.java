class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // log(n)
        List<List<Integer>> triplet = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length -2; i++){
            int left = i + 1;
            int right = nums.length - 1;
            if(i > 0 && nums[i - 1] == nums[i])
                continue;
            while(left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                if(currentSum == 0){
                    addToTiplet(nums[i], nums[left], nums[right], triplet);
                    left++;
                    while(left < right && nums[left - 1] == nums[left])
                        left++;
                }
                else if(currentSum > 0)
                    right--;
                else
                    left++;
            }
        }

        return triplet;
    }

    public static void addToTiplet(int first, int second, int third, List<List<Integer>> triplet){
        List<Integer> newTriplet = new ArrayList<Integer>();
        newTriplet.add(first);
        newTriplet.add(second);
        newTriplet.add(third);
        triplet.add(newTriplet);
    }
}