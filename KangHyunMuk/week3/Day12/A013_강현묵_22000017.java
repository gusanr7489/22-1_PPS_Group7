class Solution {
  public int singleNumber(int[] nums) {
      Map<Integer,Integer> map = new HashMap<Integer,Integer>();
      for(int n: nums) {
          if(!map.containsKey(n))
              map.put(n,1);
          else
              map.put(n,2);
      }
      for(int key: map.keySet()) {
          if(map.get(key)==1)
              return key;
      }
      return 0;
  }
}