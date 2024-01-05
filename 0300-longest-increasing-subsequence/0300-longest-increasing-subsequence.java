class Solution {
  public int lengthOfLIS(int[] nums) {
      List<Integer> ans = new ArrayList<>();

      for(int n : nums) {
          if(ans.isEmpty() || n > ans.get(ans.size() - 1)){
              ans.add(n);
          } else {
              ans.set(getIndex(ans,n),n);
          }
      }

      return ans.size();
  }

  public int getIndex(List<Integer> ans, int target) {
      int index = Collections.binarySearch(ans,target);
      return (index < 0) ? -index-1 : index; 
  }
}