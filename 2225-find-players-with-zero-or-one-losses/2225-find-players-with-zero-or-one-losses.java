class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> hash = new HashMap<>();
        for(int[] match : matches) {
          if(!hash.containsKey(match[1])) {
              hash.put(match[1], 1);
          } else {
              hash.put(match[1], hash.get(match[1]) + 1);
          }
            if(!hash.containsKey(match[0])) {
                hash.put(match[0], 0);
            }
        }
        List<Integer> winners = new ArrayList<>();
        List<Integer> losers = new ArrayList<>();
        for(int l : hash.keySet()) {
            if(hash.get(l) == 0) {
                winners.add(l);
            } else if(hash.get(l) == 1) {
                losers.add(l);
            }
        }
        Collections.sort(winners);
        Collections.sort(losers);
        ans.add(winners);
        ans.add(losers);
        
        return ans;
    }
}