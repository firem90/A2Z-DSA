class Solution {
    public int minSteps(String s, String t) {
        int[] hash = new int[26];
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        for(char c : s1) {
            hash[c - 'a']++;
        }

        for(char c : t1) {
            hash[c - 'a']--;
                        
        }

       int res = 0;
        for (int i : hash) {
          res += Math.abs(i);
        }
        return res / 2;
    }
}