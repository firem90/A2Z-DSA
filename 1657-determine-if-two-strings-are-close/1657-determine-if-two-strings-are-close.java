import java.util.Arrays;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        int[] hash1 = new int[26];
        int[] hash2 = new int[26];

        for (char c : word1.toCharArray()) {
            hash1[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            hash2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((hash1[i] == 0 && hash2[i] != 0) || (hash1[i] != 0 && hash2[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(hash1);
        Arrays.sort(hash2);

        return Arrays.equals(hash1, hash2);
    }
}
