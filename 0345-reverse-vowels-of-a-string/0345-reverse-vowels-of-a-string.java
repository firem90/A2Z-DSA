class Solution {
    public String reverseVowels(String s) {
        
        List<Character> hash = new ArrayList<>();
        char[] c = s.toCharArray();

        for(char cv : c) {
            if(cv == 'a' || cv == 'A' || cv == 'e' || cv == 'E'
            || cv == 'i' || cv == 'I' || cv == 'o' || cv == 'O'
            || cv == 'u' || cv == 'U') {
                hash.add(cv);
            }
        }

        char[] hashArr = new char[hash.size()];
        int i = hash.size() - 1;
        for(Character c1 : hash) {
            hashArr[i] = c1;
            i--;
        }

        i = 0;
        int j = 0;
        for(char cv : c) {
            if(cv == 'a' || cv == 'A' || cv == 'e' || cv == 'E'
            || cv == 'i' || cv == 'I' || cv == 'o' || cv == 'O'
            || cv == 'u' || cv == 'U') {
                c[i] = hashArr[j];
                j++;
            }
            i++;
        }        

        return new String(c);
    }
}