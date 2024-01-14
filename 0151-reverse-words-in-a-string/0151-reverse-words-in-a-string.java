class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String ans = "";

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
            if(i > 0 && !arr[i].trim().isEmpty())
                ans = ans + arr[i] + " ";
            else
                ans = ans + arr[i];
        }

        return ans.trim();
    }
}