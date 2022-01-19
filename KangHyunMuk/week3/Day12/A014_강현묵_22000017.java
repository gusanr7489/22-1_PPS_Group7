class Solution {
  public List<String> summaryRanges(int[] nums) {
      List<String> ans = new ArrayList<String>();
      if(nums.length==0)
          return ans;
      int start = nums[0];
      int end = nums[0];
      int tmp = 1;
      String str ="";
      for(int i=1; i<nums.length; i++) {
          end = nums[i];
          if(end-tmp!=start) {
              if(tmp!=1)
                  str = Integer.toString(start) + "->" + Integer.toString(nums[i-1]);
              else
                  str = Integer.toString(start);
              ans.add(str);
              tmp = 1;
              start = end;
          } else {
              tmp++;
          }
      }
      if(start==end) 
          ans.add(Integer.toString(start));
      else {
          str = Integer.toString(start) + "->" + Integer.toString(end);
          ans.add(str);
      }
      return ans;
  }
}