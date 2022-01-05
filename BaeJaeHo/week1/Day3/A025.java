class Solution {
  public main(string[] args){
    System.out.print(solution(10));
    System.out.print(solution(12));
    System.out.print(solution(11));    
    System.out.print(solution(13));
  }
    public boolean solution(int x) {
        boolean answer = true;
        int div = 0;
        int tmp = x;
        do{
            div += tmp%10;
            tmp/=10;
        } while(tmp>0);
        if(x%div != 0) answer = false;
        return answer;
    }
}
