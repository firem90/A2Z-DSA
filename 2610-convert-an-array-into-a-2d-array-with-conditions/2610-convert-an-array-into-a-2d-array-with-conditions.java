class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int[] c = new int[nums.length + 1];//7

        for(int n : nums) {
            if(ans.size() <= c[n]) {
                ans.add(new ArrayList<Integer>());
            }
            ans.get(c[n]).add(n);
            c[n]++;
        }

        return ans;
    }
}