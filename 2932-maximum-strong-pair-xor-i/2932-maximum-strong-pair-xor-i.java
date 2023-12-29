class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] >= nums [j]) {
                    if(nums[i] - nums[j] <= Math.min(nums[i],nums[j])) {
                        ans = Math.max(ans, nums[i] ^ nums[j]);
                    }
                } else {
                    if(nums[j] - nums[i] <= Math.min(nums[i],nums[j])) {
                        ans = Math.max(ans, nums[j] ^ nums[i]);
                    }
                }
            }
        }
        
        return ans;
    }
}