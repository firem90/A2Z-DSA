class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int[] hash = new int[nums.length + 1];
        int rep = 0;
        int miss = 0;

        for(int i : nums) {
            hash[i]++;
        }

        for(int i = 0; i < hash.length; i++) {
            if(hash[i] == 2) {
                rep = i;
            }
            if(hash[i] == 0) {
                miss = i;
            }
        }

        return new int[]{rep, miss};
    }
}