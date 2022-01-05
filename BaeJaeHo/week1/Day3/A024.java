public class Solution {
  public main(string[] args){
    System.out.print(isPowerOfFour(16));
  }
    public boolean isPowerOfFour(int n) {
        //4의 15승까지 표현할 수 있으니, 0~15인 16개를 비교한다
    //     if(n==1) return true;
    //     else if(n%4==0) return find(n, 1, 15);
    //     else return false;
    // }
    // public boolean find(int n, int start, int end){
    //     if(n == Math.pow(4, (end-start)/2+1)) return true;
    //     else if(n < Math.pow(4, (end-start)/2+1)) {
    //         if(start > (end-start)/2+1) return false;
    //         return find(n,1,(end-start)/2);
    //     }
    //     else {
    //         if(end < (end-start)/2+2) return false;
    //         return find(n,(end-start)/2+2, end);
    //     }
    // }
        for(int i=0;i<16;i++){
            if(n == Math.pow(4,i)) return true;
        }
        return false;
    }
}
