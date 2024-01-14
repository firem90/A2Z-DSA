class Solution {
    public boolean halvesAreAlike(String s) {
        char[] s1 = s.substring(0, s.length() / 2).toCharArray();
        char[] s2 = s.substring(s.length()/2).toCharArray();

        int c1 = countVow(s1);
        int c2 = countVow(s2);

        return c1 == c2;
        
    }
    

    public int countVow(char[] s) {
        int count = 0;
        for(char c : s) {
            if(c == 'a' || c == 'A' ||
               c == 'e' || c == 'E' ||
               c == 'i' || c == 'I' ||
               c == 'o' || c == 'O' ||
               c == 'u' || c == 'U') {
                  count++; 
               }
        }

        return count;
    }
}