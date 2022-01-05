class Solution {
  public boolean solution(int x) {
      boolean answer = true;
      int num=0;
      int tmp = x;
      if(x<10) 
          num = x;
      else {
          do {
              num += tmp % 10;
              tmp = tmp / 10;
          } while(tmp > 10);
          num += tmp;
      }
      if(x % num !=0) answer =false;
      return answer;
  }
}