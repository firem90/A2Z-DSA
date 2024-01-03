class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int prev = 0;
        for(String s : bank) {
            int noOfLasers = numberOfLasers(s);
            if(noOfLasers != 0) {
                ans = ans + (prev * noOfLasers);
                prev = noOfLasers;
            }
        }

        return ans;
    }

    public int numberOfLasers(String row) {
        char[] cRow = row.toCharArray();
        int no = 0;
        for(char c : cRow) {
            no += c - '0';
        }   
        return no;
    }
}