class Solution {
  public main(String[] args){
    System.out.println(lemonadeChange([5,5,5,10,20]);
    System.out.println(lemonadeChange([5,5,10,10,20]);
  }
    public boolean lemonadeChange(int[] bills) {
        int num_5 =0;
        int num_10 =0;
        for(int bill : bills){
            if(bill == 5){
                num_5++;
            }
            else if(bill == 10){
                if (num_5>0) num_5--;
                else return false;
                num_10++;
            }
            else{
                if(num_5 >0 && num_10>0){
                    num_5--;
                    num_10--;
                }
                else if(num_5>=3) num_5-=3;
                else return false;
            }
        }
        return true;
    }
}
