class Solution {
  public boolean isPerfectSquare(int num) {
      int sqr = isSquare(num);
      if(sqr*sqr==num)
          return true;
      else
          return false;
  }
  public static int isSquare(int n) {
      double x = 2;
      double next_x;
      while(1) {
          //바빌로니아 법 알고리즘, O(log n)
          next_x = (x + n/x) / 2;
          // x값이 점점 square 값에 다가감 
          // 값에 가까울 수록 next_x값과 비교했을 때 얼추 같음
          double abs = Math.abs(x-next_x);
          if(abs<0.000001) {
              return (int)x;
          }
          x = next_x;
      } 
  }
}