class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> hash = new HashMap<>();
        
        for(int[] match : matches) {
            hash.put(match[1], hash.getOrDefault(match[1], 0) + 1);
            
            hash.putIfAbsent(match[0], 0);
        }
        
        List<Integer> winners = new ArrayList<>();
        List<Integer> oneLossPlayers = new ArrayList<>();
        
        for (int player : hash.keySet()) {
            if (hash.get(player) == 0) {
                // Player has not lost any matches
                winners.add(player);
            } else if (hash.get(player) == 1) {
                // Player has lost exactly one match
                oneLossPlayers.add(player);
            }
        }
        Collections.sort(winners);
        Collections.sort(oneLossPlayers);
        ans.add(winners);
        ans.add(oneLossPlayers);
        
        return ans;
    }
}
