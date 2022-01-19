class Solution {
  public List<Integer> selfDividingNumbers(int left, int right) {
      List<Integer> list = new ArrayList<Integer>();
      for(int i=left; i<=right;i++){
          if(isSelfDriving(i))
              list.add(i);
      }
      return list;
  }
  public static boolean isSelfDriving(int num) {
      if(num<10) 
          return true;            
      String str = String.valueOf(num);
      if(str.contains("0"))
          return false;
      int digit = num;
      for(int i=0; i<str.length(); i++) {
          int tmp = digit%10;
          if(num%tmp!=0)
              return false;
          digit /=10;
      }
      return true;
  }
}