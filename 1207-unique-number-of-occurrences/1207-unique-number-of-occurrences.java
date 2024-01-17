class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] hash = new  int[2001];

        for(int i : arr) {
            hash[i+1000]++;
            // System.out.print(hash[i+1000]);
        }
        

        Set<Integer> occurrenceSet = new HashSet<>();
        for (int count : hash) {
            if (count != 0) {
                if (!occurrenceSet.add(count)) {
                    return false;  
                }
            }
        }

        return true;               
            
    }
}

/*if(hash[i] != 0 && temp == -1){
                temp = hash[i];
                System.out.println(hash[i]);
                continue;
            }

            if(hash[i] != 0 && hash[i] == temp) {
                System.out.println(hash[i]);
                return false;
            }*/