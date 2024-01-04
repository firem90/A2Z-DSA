/* Sliding Window Solution 
class Solution {
    public int countGoodSubstrings(String s) {
        int left = 0;
        int right = 2;
        char[] c = s.toCharArray();
        int count = 0;

        while(right < c.length) {
            boolean good = isGood(c, left, right);

            if(good) {
                count++;
            }
            left++;
            right++;
        }

        return count;
    }

    public boolean isGood(char[] c, int l, int r) {
        Set<Character> mySet = new HashSet<>();
        for(int i = l; i <= r; i++) {
            mySet.add(c[i]);
            // System.out.println(c[i]);
        }
        // System.out.println(mySet.size());

        return mySet.size() == (r - l + 1);
    }
} */

// Normal Direct soln
class Solution {
    public int countGoodSubstrings(String s) {
        int result = 0;
        for(int i = 0 ; i<s.length()-2 ; ++i){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            char ch3 = s.charAt(i+2);
            if(ch1!=ch2 && ch2!=ch3 && ch1!=ch3) ++result;
        }
        return result;
    }
}