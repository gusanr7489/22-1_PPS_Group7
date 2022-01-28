import java.util.Scanner;
import java.math.*;

public class LevelB_77 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    BigInteger result = new BigInteger("0");
	    BigInteger temp = new BigInteger("0");
	    BigInteger prev = new BigInteger("1");
	    BigInteger current = new BigInteger("1");
		
		if(n==1 || n==2) result = BigInteger.valueOf(1);
		else {
			for(int i=3; i<=n; i++) {
				temp = current;
				current = prev.add(current);
				prev = temp;
			}
			result = current;
		}
		
		System.out.println(result);
		sc.close();
	}
	
	

}
