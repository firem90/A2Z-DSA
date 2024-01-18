class Solution {
    Map<Integer,Integer> hash = new HashMap<>();
    public int climbStairs(int n) {
        if(n == 0) return 1;
        if(n == 1) return 1;
        if(n == 2) return 2;

        if(hash.containsKey(n)) {
            return hash.get(n);
        }

        int left = climbStairs(n - 1);
        int right = climbStairs(n - 2);

        hash.put(n, left + right);

        return left + right;
    }
}