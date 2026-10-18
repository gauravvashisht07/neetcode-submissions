

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // map from number to its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        
        // according to problem, there is exactly one solution
        throw new IllegalArgumentException("No two sum solution");
    }
}
