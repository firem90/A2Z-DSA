class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int ans = 0;

        for(int val : tasks) {
            if(!hash.containsKey(val)) {
                hash.put(val, 1);
            } else {
                hash.put(val, hash.get(val) + 1);
            }
        }

        for(Integer v : hash.values()) {
            if(v == 1) return -1;
            int c = v / 3;
            int e = v % 3;

            ans += e == 0 ? c : c + 1;
        }

        return ans;
    }
}