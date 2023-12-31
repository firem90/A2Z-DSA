class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        char[] c = s.toCharArray();
        int res = -1;
        int n = 0;
        for(Character i : c) {
            if(hash.containsKey(i)) {
                res = Math.max(res, n - hash.get(i) - 1);
                
            } else {
                hash.put(i, n);
            }
            n++;
        }

        return res;
    }
}