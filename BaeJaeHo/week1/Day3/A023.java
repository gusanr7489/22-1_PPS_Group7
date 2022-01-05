public class  A023{
  public static main(string[] args){
    System.out.print(addDigits);
  }
  public int addDigits(int num) {
    if(num>9){    
      int answer=0;
      do{
        answer += num%10;
        num /= 10;
      } while(num>0);
      return addDigits(answer);
    }
    else if(num<0) return addDigits(-1*num);
    return num;
  }
}
